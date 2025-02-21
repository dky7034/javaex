import java.util.Scanner;

public class Example1 {
  public static void main(String[] args) {
    // 두 개의 숫자를 입력 받아서 더해주는 프로그램을 while 문과 method를 이용해서 작성하라
    // while 문의 종료 조건은 음수 값을 입력하는 경우이다

    // 초기식
    Scanner in = new Scanner(System.in);
    System.out.println("입력한 숫자 두 개를 더하는 프로그램입니다(양수).");

    // while 반복문 시작
    while (true) {
      // 사용자에게 입력받기
      System.out.print("첫 번째 숫자를 입력해 주세요(양수): ");
      int num1 = in.nextInt();
      if (num1 < 0) {
        System.out.println("음수 값을 입력하셨습니다. 프로그램을 종료합니다.");
        break;
      }
      System.out.print("두 번째 숫자를 입력해 주세요(양수): ");
      int num2 = in.nextInt();
      if (num2 < 0) {
        System.out.println("음수 값을 입력하셨습니다. 프로그램을 종료합니다.");
        break;
      }

      // 메서드 호출
      int result = 0;
      result = add(num1, num2);
      System.out.println("입력하신 두 수의 합은 " + result + "입니다.");
    } // end while

  } // end main method
  // 메서드 생성
  private static int add(int x, int y) {
    int add = 0;
    add = x + y;
    return add;
  }

} // end class
