package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class LazyDemo3 {
  public static void main(String[] args) {
    IntStream intStream = IntStream.generate(() -> new Random().nextInt(10)); // Supplier: 받는 것 없이(매개변수 없이) 주기만 함(리턴만 함) - 제공자

    intStream.filter(i -> { // Predicate: 받은 것을(매개변수 있음) 조건으로 판단함(참 또는 거짓을 리턴) - 판단자
          System.out.println("filter: " + i);
          return i % 2 == 0;
        }).limit(3)
        .map(x -> { // UnaryOperator:
          System.out.println("map: " + x);
          return x * x;
        }).forEach(j -> System.out.println("forEach: " + j));

  }
}
