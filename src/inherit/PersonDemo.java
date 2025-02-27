package inherit;

public class PersonDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = s; // 자손은 부모타입의 참조변수로 자동 형변환

    System.out.println(p.name);
    p.whoami();

    (Student) p;
  }
}
