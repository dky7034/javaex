package test;

public class PersonDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new Person("길동이", 22);
    people[0] = new Student("황진이", 23, 100);
    people[0] = new ForeignStudent("Amy", 30, 200, U.S.A);
  }
}
