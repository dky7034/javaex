package inherit;

public class PersonDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = s; // 자손은 부모타입의 참조변수로 자동 형변환

    System.out.println(p.name);
    p.whoami();

    Student s1 = (Student) p; // 명시적, 강제 형변환
    System.out.println(s1.name);
    s1.whoami();
    System.out.println(s1.number);
    s1.work();

    Student[] students = new Student[3];
    Worker[] workers = new Worker[3];
  }
}
