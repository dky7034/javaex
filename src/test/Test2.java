package test;

import java.util.stream.Stream;

public class Test2 {
  public static void main(String[] args) {
    Stream.of("a1", "a2", "a3")
        .map(s -> s.substring(1))
        .mapToInt(Integer::parseInt)
  }
}
