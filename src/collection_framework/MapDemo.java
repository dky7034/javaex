package collection_framework;

import java.util.Map;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, Integer> fruits = null;
    try {
      fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getLocalizedMessage());
    } catch (NullPointerException e) {
      System.out.println("자료 생성 과정에서 오류가 발생했습니다.");
    }
    System.out.println(fruits.size() + "종류의 과일이 있습니다.");

    for (String s : fruits.keySet()) {
      System.out.println(s);
    }
  }
}
