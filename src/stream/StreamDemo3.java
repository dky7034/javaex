package stream;

import java.util.Random;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class StreamDemo3 {
  public static void main(String[] args) {
    IntStream iterate = IntStream.iterate(0, x -> x + 1); // 무한 생성
    iterate.limit(2).forEach(System.out::println);

    UnaryOperator unaryOperator = new UnaryOperator() {
      @Override
      public Object apply(Object o) {
        return null;
      }
    };

    Random r = new Random();
    IntStream intStream = r.ints();
//    intStream.forEach(System.out::println); // 무한루프

//    IntStream.generate(() -> new Random()
//        .nextInt(10))
//        .forEach(System.out::println); // 무한루프

//    IntStream range = IntStream.range(1, 10); // 유한 생성, end 불포함 (1, 2, 3, 4, 5, 6, 7, 8, 9)
//    range.forEach(System.out::println);

//    LongStream range2 = LongStream.rangeClosed(1, 10); // 유한 생성, end 포함 (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    range2.forEach(System.out::println);

  } // end of main method
} // end of class
