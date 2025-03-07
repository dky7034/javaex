package lambda;

import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    list.forEach(i -> System.out.print(i + " : "));
  }
}
