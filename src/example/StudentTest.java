package example;

public class StudentTest {
  public static void main(String[] args) {
    System.out.println(new Student("김삿갓"));
  }
}

class Student{
  // 필드
  String name;
  // 생성자
  public Student(String name) {
    this.name = name;
  }
  // 메서드

  @Override
  public String toString() {
    return "학생 [" + name + "]";
  }
}
