package collection_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    Arrays.asList(fruits);
    Collections.sort(fruits);
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
    Collections.sort(fruitsMap);

  }
}
