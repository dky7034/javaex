package stream;

import java.util.Optional;
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

    System.out.println("--- ifPresentOrElse 실행 ---");
    divide.ifPresentOrElse(
        n -> System.out.println(divide), // 값이 매개변수(n)로 넘어옵니다. 넘어온 값을 가지고 뭔가를 처리할 수 있습니다.
        () -> System.out.println("0으로 나눌 수 없습니다.")
    );

  }

  public static OptionalDouble divide(double x, double y) {
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }

  public static OptionalInt divide(int x, int y) {
    return y == 0 ? OptionalInt.empty() : OptionalInt.of(x / y);
  }

  public static Optional<String> check(String s) {
    return Optional.ofNullable();
  }

}
