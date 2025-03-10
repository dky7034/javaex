package collection_framework;

import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = null;
    try {
      fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1, "사과", 50);
    } catch (IllegalArgumentException e) {
      System.out.println("");
    }
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");
  }
}
