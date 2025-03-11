package stream;

import java.util.OptionalDouble;

public class OptionalDemo {
  public static void main(String[] args) {
    System.out.println(divide(0.0, 1.0));
  }

  public static OptionalDouble divide(double x, double y) {
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }

}
