package exercise.chapter7;

public class Ex6 {
  public static void main(String[] args) {
    Human.echo(); // 야호!!
    Student s = new Student(20);
    s.print(); // 20세의 학생입니다.
    s.eat(); // 도시락을 먹습니다.

    Human p = new Worker();
    p.print(); // 인간입니다.
    p.eat(); // 빵을 먹습니다.
  }
}

interface Human {
  static void echo() {
    System.out.println("야호!");
  }

  void eat();

  default void print() {
    System.out.println("인간입니다.");
  }
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }

  // 동적 바인딩
  // 메서드가 오버라이딩된 경우에는 실제 객체의 메서드가 실행되도록 동적 바인딩이 적용됨
  @Override
  public void print() {
    Human.super.print();
  }
}

class Student implements Human {
  // 필드
  int age;

  // 생성자
  public Student(int age) {
    this.age = age;
  }

  // 메서드
  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  @Override
  public void print() {
    System.out.println(age + "세의 학생입니다.");
  }
}