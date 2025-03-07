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
}