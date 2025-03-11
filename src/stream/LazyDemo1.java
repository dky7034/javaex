package stream;

import java.util.stream.IntStream;

public class LazyDemo1 {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);

    intStream.filter(i -> {
      System.out.println("filter: " + i);
      return i % 2 == 0;
    }).map(x -> {
      System.out.println("map: " + x);
    }).forEach();

  }
}
