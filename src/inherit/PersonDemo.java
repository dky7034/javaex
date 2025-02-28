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
    // Person을 담는 배열을 선언하고, 여기에 student, worker를 담을 수 있다.
    Person[] persons = new Person[3];

  }

  static void method1(Student s) {
    s.work();
  }

  static void methodAll(Person p) {
    if (p instanceof Person) {
      p.whoami();
    }
    if (p instanceof Student) {
      Student s = (Student) p;
      s.work();
    } else if (p instanceof Worker) {
      Worker w = (Worker) p;
      w.work();
    }
  }
}