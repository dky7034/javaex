package exercise.chapter8;

import java.util.Objects;

public class Ex1_2 {
  public static void main(String[] args) {
    Person p1 = new Person("111112", "손흥민");
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

  // equals() 사용
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person && obj != null) {
      Person p = (Person) obj;
      if (this.name.equals(p.name) && this.num.equals(p.num)) {
        return true;
      }
    }
    return false;
  }

  // Hash
  @Override
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person p = (Person) obj;
    return this.hashCode() == obj.hashCode();
  }

  @Override
  public int hashCode() {
    return Objects.hash(num, name);
  }

}
