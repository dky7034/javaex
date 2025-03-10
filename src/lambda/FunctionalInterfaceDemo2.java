package lambda;

public class FunctionalInterfaceDemo2 {
}

@FunctionalInterface
interface Calculable {
  // 추상메서드
  void calculate(int x, int y);
}
