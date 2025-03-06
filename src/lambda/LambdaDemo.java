package lambda;

public class LambdaDemo {
  public static void main(String[] args) {
    Object obj = new AnyObject() {
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };
    obj.max():
  }
}

// (a, b) -> a > b ? a : b;
class AnyObject {
  class Anonymous {
    int max(int a, int b) {
      return a > b ? a : b;
    }
  }
}
