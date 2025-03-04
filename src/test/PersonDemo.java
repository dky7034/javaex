package test;

public class PersonDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new Person(10);
    people[1] = new Person(20);
    people[2] = new Person(17);
  }


}

class Person implements Comparable<Person> {
  String name;
  int age;
  int height;
  int weight;

  public Person(int age) {
    this.age = age;
  }


  @Override
  public int compareTo(Person p) {
    return (Integer.compare(this.age, p.age));
  }
}
