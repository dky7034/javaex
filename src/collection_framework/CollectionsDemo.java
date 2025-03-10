package collection_framework;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    List<String> fruitsList = Arrays.asList(fruits);
    Collections.sort(fruits);
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
    Collections.sort(fruitsMap);

  }
}
