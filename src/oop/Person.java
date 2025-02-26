package oop;

public class Person {
  // 필드
  private String name;
  private int age;

  // 생성자
  public Person() {}

  // getter and setter
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public Person setName(String name) {
    this.name = name;
    return this;
  }
  public Person setAge(int age) {
    this.age = age;
    return this;
  }

  // 메서드
  public void sayHello() {
    System.out.printf("안녕하세요. 제 이름은 %s 이고, 나이는 %d 살입니다.\n", this.name, this.age);
  }

}