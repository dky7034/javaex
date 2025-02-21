import java.util.Scanner;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력하세요: ");
    int number = in.nextInt();
    int remainder = number % 2;
    String result = "";
    if (remainder == 0) {
      result = "짝수";
    } else {
      result = "홀수";
    }
    System.out.println(result);
  }
}
