package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo3 {
  public static void main(String[] args) {
    Random r = new Random();
    IntStream intStream = r.ints();
//    intStream.forEach(System.out::println); // 무한루프
    Stream.generate(() -> 1)
  }
}
