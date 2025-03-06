package lambda;

public class LambdaDemo4 {
  public static void main(String[] args) {
    DiceFunction d1 = () -> {
      
    };
  }
}

@FunctionalInterface
interface DiceFunction {
  int roll();
}