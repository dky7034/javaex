package lambda;

public class LambdaDemo2 {
  public static void main(String[] args) {
    PrintFunction printFunction = new PrintFunction() {
      @Override
      public void printVar(String name, int i) {
        System.out.println(name);
      }
    };
  }
}

@FunctionalInterface
interface PrintFunction {
  void printVar(String name, int i);
}
