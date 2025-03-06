package lambda;

public class LambdaDemo3 {
  public static void main(String[] args) {

  }
}

// 함수형 인터페이스
@FunctionalInterface
interface SquareFunction {
  int square(int x);
}