package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamDemo3 {
  public static void main(String[] args) {
    Random r = new Random();
    IntStream intStream = r.ints();
//    intStream.forEach(System.out::println); // 무한루프

//    IntStream.generate(() -> new Random()
//        .nextInt(10))
//        .forEach(System.out::println); // 무한루프

//    IntStream range = IntStream.range(1, 10); // 1 ~ 9 까지 한 번씩 생성, end 불포함 (1, 2, 3, 4, 5, 6, 7, 8, 9)
//    range.forEach(System.out::println);

    LongStream range2 = LongStream.rangeClosed(1, 10); // end 포함
    range2.forEach(System.out::println);

  } // end of main method
} // end of class
