import java.util.Scanner;

public class ArithmeticDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해 주세요: ");
    int number = in.nextInt();
    // 입력한 수가 짝수인 경우
    if (number % 2 == 0) {
      System.out.println("입력한 수는 짝수입니다.");
    } else {
      System.out.println("입력한 수는 홀수입니다.");
    }
  }
}
