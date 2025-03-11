package stream;

import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b1 = Stream.of("a1", "b1", "c2").anyMatch(x -> x.startsWith("c"));
    System.out.println("b1 = " + b1); // false

    System.out.println(Stream.of(2, 4, 6, 8, 10).allMatch(i -> i % 2 == 0)); // true

    System.out.println(Stream.of(2, 4, 6, 8, 10).noneMatch(i -> i % 2 == 0)); //

  }
}
