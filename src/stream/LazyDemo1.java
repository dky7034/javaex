package stream;

import java.util.stream.IntStream;

public class LazyDemo1 {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);
  }
}
