package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();

    fruits.put(new Fruit("사과"), 5);

  }
}

class Fruit {
  String name;
  public Fruit(String name) {
    this.name = name;
  }
}
