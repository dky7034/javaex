package exercise.chapter8;

public class Ex1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "홍길동");
    Person p2 = new Person("111111", "손흥민");
    Person p3 = new Person("123456", "손흥민");
  }
}

class Person {
  String name;
  String num;

  public Person(String num, String name) {
    this.name = name;
    this.num = num;
  }

//  @Override
//  public boolean equals(Person person) {
//  }
}
