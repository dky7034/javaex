package lambda;

public class LambdaDemo {

}

class AnyObject {
  class Anonymous {
    int max(int a, int b) {
      return a > b ? a : b;
    }
   // (a, b) -> a > b ? a : b;
  }
}
