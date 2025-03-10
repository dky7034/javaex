package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo3 {
  public static void main(String[] args) {
    Random r = new Random();
    IntStream intStream = r.ints();
//    intStream.forEach(System.out::println); // 무한루프
    IntStream.generate(() -> new Random().nextInt(10)).forEach(System.out::println);
  }
}
