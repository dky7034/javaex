package stream;

import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);
    IntStream filterStream = intStream.filter(i -> i % 2 == 0);
    IntStream mapStream = filterStream.map(x -> x * x);

    IntStream.rangeClosed(1, 5).filter(i -> i % 2 == 0).map(x -> x * x);

  }
}
