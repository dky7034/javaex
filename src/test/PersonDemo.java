package test;

public class PersonDemo {
  Person p = new Person();

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
