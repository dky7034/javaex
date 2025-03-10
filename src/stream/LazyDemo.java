package stream;

import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);
    IntStream filterIntStream = intStream1.filter(i -> i % 2 == 0);

    UnaryOperator unaryOperator = new UnaryOperator() {
      @Override
      public Object apply(Object o) {
        return null;
      }
    };

  }
}
