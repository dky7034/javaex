package test;

public class PersonDemo {

}

class Person implements Comparable<Person> {
  String name;
  int age;
  int height;
  int weight;

  @Override
  public int compareTo(Person p) {
    return (Integer.compare(this.age, p.age));
  }
}
