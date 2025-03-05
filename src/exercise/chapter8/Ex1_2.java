package exercise.chapter8;

public class Ex1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");
    Person p3 = new Person("123456", "손흥민");
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
      
    }

  }
}
