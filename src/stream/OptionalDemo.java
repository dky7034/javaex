package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main(String[] args) {
    System.out.println(divide(3.0, 1.0));
    System.out.println(divide(3.0, 1.0).getAsDouble());

    System.out.println(divide(1, 0));
  }

  public static OptionalDouble divide(double x, double y) {
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }

  public static OptionalInt divide(int x, int y) {
    return OptionalInt.of(x / y);
  }

}
