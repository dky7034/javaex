package collection_framework;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
    List<String> fruitsList = Arrays.asList(fruits);
//    Collections.sort(fruitsList); // Collections 클래스의 sort 메서드는 배열, Set 사용 불가능
    Map<Fruit, Integer> fruitsMap = new HashMap<>();
//    Collections.sort(fruitsMap); // Map 구현체도 사용 불가능

  }
}
