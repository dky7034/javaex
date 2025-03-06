package lambda;

public class LambdaDemo3 {
  public static void main(String[] args) {
    SquareFunction s = new SquareFunction() {
      @Override
      public int square(int x) {
        return x * x;
      }
    };
    // 람다식
    SquareFunction s2 = 3 -> x * x;
  }
}

// 함수형 인터페이스 선언
@FunctionalInterface
interface SquareFunction {
  int square(int x);
}