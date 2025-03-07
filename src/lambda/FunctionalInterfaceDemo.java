package lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach(i -> System.out.print(i + " : "));
//    list.removeIf(j -> j % 2 == 0); // list의 모든 요소를 읽어서 짝수를 삭제
    System.out.println();
//    list.forEach(integer -> System.out.println(integer + " : "));
    list.replaceAll(i -> i * 10);
    list.forEach(i -> System.out.print(i + " : "));

    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "사과");
    map.put(2, "딸기");
  }
}
