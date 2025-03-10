package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();

    fruits.put(new Fruit("사과"), 5);
    fruits.put(new Fruit("바나나"), 3);
    fruits.put(new Fruit("바나나"), 30);

    System.out.println(fruits);
  }
}

class Fruit {
  String name;
  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Fruit{" +
        "name='" + name + '\'' +
        '}';
  }
}
