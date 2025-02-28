import java.util.Scanner;

public class ArithmeticDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;
    double result = (double) a * b;
    System.out.println("c = " + result);

    int apple = 1;
    double priceUnit = 0.1;
    int number = 7;

    double result2 = priceUnit * number;
    System.out.println("result2 = " + result2);

    Scanner in = new Scanner(System.in);
    System.out.print("어떤 숫자로 나눌까요? (0.1 같은 실수 입력): ");
    double i = in.nextDouble();
    if (i != 0) {
      double result3 = 3 / i;
      System.out.println("result3 = " + result3);
    }
  }
}
