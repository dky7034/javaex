package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>Arrays.(1, 2, 3, 4, 5);
    list.removeIf(j -> j % 2 == 0);
    list.forEach(i -> System.out.print(i));
    System.out.println();
    list.forEach(System.out::println);

    System.out.println();
    list.replaceAll(i -> i * 10);
    list.forEach(i -> System.out.print(i + " : "));

    System.out.println();
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "사과");
    map.put(2, "딸기");
    map.forEach((k, v) -> System.out.println(k + ", " + v));
  }
}
