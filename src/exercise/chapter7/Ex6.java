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
  void eat();
  void print();
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}

class Student extends Worker {
  // 필드
  int age;

  // 생성자
  public Student(int age) {
    this.age = age;
  }

  // 메서드
  void print() {
    System.out.printf("%d세의 학생입니다.\n", age);
  }

  @Override
  public void eat() {

  }
}