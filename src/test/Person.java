package test;

public class Person {
  // 필드
  private String name;
  private int age;

  // 생성자
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 메서드
  // getter and setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // 다른 메서드
  void shoe() {

  }
}

class Student extends Person {
  // 필드
  private int stuNum;

  // 생성자
  public Student(String name, int age, int, int stuNum) {
    super(name, age);
    this.stuNum = stuNum;
  }

  // 메서드
  // getter and setter
  public int getStuNum() {
    return stuNum;
  }

  public void setStuNum(int stuNum) {
    this.stuNum = stuNum;
  }

  // 다른 메서드
  void show() {
  }
}

class ForeignStudent extends Person {
  // 필드
  private String nationality;

  // 생성자
  public ForeignStudent(String name, int age, String nationality) {
    super(name, age);
    this.nationality = nationality;
  }

  // 메서드
  // getter and setter
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  // 다른 메서드
  void show() {
  }
}
