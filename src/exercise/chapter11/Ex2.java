package exercise.chapter11;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 35));

    for (Person person : set) {
      System.out.print(person);
    }

  }
}

// Person 클래스
class Person {
  // 필드
  String name; // 이름
  int age; // 나이

  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  // toString 오버라이딩
  @Override
  public String toString() {
    return "Person[" + name + ":" + age + "]";
  }

  // equals 오버라이딩
  @Override
  public boolean equals(Object obj) {
    // obj 가 현재 객체와 같은 타입인지 판별하는 조건문
    // null 체크 필수
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person p = (Person) obj;
    return (this.name.equals(p.name)); // 이름이 같으면 true 리턴, 다르면 false 리턴


  }

//  // hashCode 오버라이딩
//  @Override
//  public int hashCode() {
//    return Objects.hash(name);
//  }
}