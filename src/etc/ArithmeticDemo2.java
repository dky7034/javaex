package etc;

import java.util.Scanner;

public class ArithmeticDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해 주세요: ");
    int number = in.nextInt();

    // 조건문 사용
//    if (number % 2 == 0) {
//      System.out.println("입력한 수는 짝수입니다.");
//    } else {
//      System.out.println("입력한 수는 홀수입니다.");
//    }

    // 삼항연산자 사용
    String evenOdd = (number % 2 == 0) ? "짝수" : "홀수";
    System.out.printf("입력한 수는 %d이며, %s입니다.", number, evenOdd);

  }
}
