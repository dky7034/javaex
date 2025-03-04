package test;

public class PersonDemo {
  Person p1 = new Person(10);
  Person p2 = new Person(20);

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
