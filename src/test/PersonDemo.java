package test;

public class PersonDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new Person("홍길동", 19);
    people[1] = new Person("유관순", 23);
    people[2] = new Person("손흥민", 21);

    for (int i = 0; i < people.length; i++) {
      if (people[i].compareTo(people[i+1]) > 0) {
        people[i + 1] = people[i];
      }
    }
  }

}

class Person implements Comparable<Person> {
  String name;
  int age;
  int height;
  int weight;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public int compareTo(Person p) {
    return (Integer.compare(this.age, p.age));
  }
}
