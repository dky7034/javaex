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
        .filter(i -> i % 2 == 1) // IntPredicate(i) -> 조건식 (리턴 타입이 boolean)
        .limit(3)
        .map(x -> x * 2) // IntUnaryOperator (i) -> i * 2
        .forEach(System.out::println);
  }
}
