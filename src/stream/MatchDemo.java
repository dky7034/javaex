package stream;

import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b1 = Stream.of("a1", "b1", "c2").anyMatch(x -> x.startsWith("c"));

  }
}
