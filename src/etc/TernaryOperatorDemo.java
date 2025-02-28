package etc;

import java.util.Scanner;

public class TernaryOperatorDemo {
  public static void main(String[] args) {
    // 삼항 연산자
    // 조건식 ? 연산식(true) : 연산식(false)
    boolean res = (1 != 1) ? true : false;
    System.out.println(res);

    // 사용자에게 입력받기
    Scanner in = new Scanner(System.in);
    System.out.print("정수를 입력해 주세요");
  }
}
