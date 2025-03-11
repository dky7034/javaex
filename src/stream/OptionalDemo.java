package stream;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main(String[] args) {
    System.out.println(divide(3.0, 1.0));
    System.out.println(divide(3.0, 1.0).getAsDouble());

    OptionalInt divide = divide(3, 0);
    if (divide.isEmpty()) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else if (divide.isPresent()) {
      System.out.println(divide);
    }

    divide.ifPresentOrElse(() -> {
      System.out.println(divide),
          () -> System.out.println("0으로 나눌 수 없습니다.");
    }

    public static OptionalDouble divide ( double x, double y){
      return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
    }

    public static OptionalInt divide ( int x, int y){
      return y == 0 ? OptionalInt.empty() : OptionalInt.of(x / y);
    }

  }
