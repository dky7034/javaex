package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(10);
    System.out.println(set);

    set.add(10); // 중복 요소 추가 안 됨
    set.add(5);
    System.out.println(set);

    Set<String> set2 = Set.of("a", "b", "c");
    HashSet<String> setHashSet = new HashSet<>(set2);
    set2.add("e");
    set2.add("a");
    System.out.println("setHashSet = " + setHashSet);

  }
}
