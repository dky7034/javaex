package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");
//    list.add("k3"); // List.of로 만들어진 객체는 Array를 기반으로 만들어졌으므로 크기가 고정되어있어 요소를 추가할 수 없습니다.
    List<String> list2 = new ArrayList<>(list);
    list2.add("k3");
    list2.set(0, "뉴 그랜저");
    list2.removeIf(s -> s.startsWith("소"));
    System.out.println("list2 = " + list2);
    list2.forEach(s -> System.out.println(s));
    list2.forEach(System.out::println);
    list2.replaceAll(s -> "뉴 " + s);
    list2.forEach(System.out::println);
    list2.clear();
    if (list2.isEmpty()) {
      System.out.println("리스트가 비었습니다.");
    }
  }
}
