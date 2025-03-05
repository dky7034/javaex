package exercise.chapter8;

public class Ex1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");
    Person p3 = new Person("123456", "손흥민");

    if (p1.equals(p2)) {
      System.out.println("같은 사람이다.");
    } else {
      System.out.println("다른 사람이다.");
    }
  }
}

class Person {
  String num;
  String name;

  public Person(String num, String name) {
    this.num = num;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person) {
      Person p = (Person) obj;
      if (this.name.equals(p.name) && this.num.equals(p.num)) {
        return true;
      }
    }
    return false;
  }

}
