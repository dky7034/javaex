package lambda;

public class LambdaDemo2 {
  public static void main(String[] args) {

  }
}

@FunctionalInterface
interface PrintFunction {
  void printVar(String name, int i);
}
