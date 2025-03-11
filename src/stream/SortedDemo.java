package stream;

import java.util.List;

public class SortedDemo {
  public static void main(String[] args) {
    List<String> list1 = List.of("a1", "c2", "b3", "b2", "a4");
    list1.stream().sorted()
        .forEach(Util::printWithParenthesis);

    System.out.println();

    List<Integer> list2 = List.of(7, 10, 5, 3, 1, 2);
    list2.stream().sorted()
        .forEach(Util::printWithParenthesis);
  }
}
