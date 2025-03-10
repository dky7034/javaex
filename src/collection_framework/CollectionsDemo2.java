package collection_framework;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsDemo2 {
  public static void main(String[] args) {
    List<String> list1 = List.of("포도", "키위", "수박", "사과", "망고", "포도", "키위", "수박", "사과", "망고");
    System.out.println(list1);
    Set<String> set = new HashSet<>(list1);
    System.out.println(set);
    list1.set(0, "키위");

  }
}
