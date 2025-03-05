package exercise.chapter7;

public class Ex6 {
  public static void main(String[] args) {
    Human.echo(); // 야호!!
    Student s = new Student(20);
    s.print(); // 20세의 학생입니다.
    s.eat(); //

    Human p = new Worker();
    p.print();
    p.eat();
  }
}

interface Human {
  void eat();
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}