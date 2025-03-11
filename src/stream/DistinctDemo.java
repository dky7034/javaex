package stream;

import java.util.stream.IntStream;

public class DistinctDemo {
  public static void main(String[] args) {
    IntStream is = IntStream.of(1, 2, 1, 3, 3, 2, 2, 4, 4);
  }
}
