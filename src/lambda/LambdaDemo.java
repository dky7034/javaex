package lambda;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new Object() {
//      int max(int a, int b) {
//        return a > b ? a : b;
//      }
//    };
    MyFunction mf = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };
    mf.max(3, 5); // 5 출력
  }
}

// 함수형 인터페이스 - 단 하나의 추상 메서드만 가지는 인터페이스
interface MyFunction {
  public abstract int max(int a, int b);
}

// (a, b) -> a > b ? a : b;
//class AnyObject {
//  class Anonymous {
//    int max(int a, int b) {
//      return a > b ? a : b;
//    }
//  }
//}

