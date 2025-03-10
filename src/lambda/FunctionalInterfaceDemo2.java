package lambda;

public class FunctionalInterfaceDemo2 {
  public static void main(String[] args) {
    // 두 개의 정수를 입력받아서 두 수를 더한 후 그 결과를 출력
    
  }
}

@FunctionalInterface
interface Calculable {
  // 추상메서드
  void calculate(int x, int y);
}
