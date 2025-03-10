package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
//    IntStream intStream = IntStream.rangeClosed(1, 5);
//    IntStream filterStream = intStream.filter(i -> i % 2 == 0);
//    IntStream mapStream = filterStream.map(x -> x * x);

    IntStream.rangeClosed(1, 5)
        .filter(i -> i % 2 == 0)
        .map(x -> x * x)
        .forEach(System.out::println);

    System.out.println("----------");

    IntStream.generate(() -> new Random().nextInt(0, 11))
        .filter(i -> i % 2 == 1)
        .limit(3)
        .map(x -> x * 2)
        .map
        .forEach(System.out::println);
  }
}
