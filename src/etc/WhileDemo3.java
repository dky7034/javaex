import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    // 초기식
    Scanner in = new Scanner(System.in);
    // 사용자에게 입력받기
    System.out.print("구구단 몇 단을 출력할까요? (2 ~ 9): ");
    int dan = in.nextInt();

    // while () 무한 반복
    while (true) {
      // 조건식, 분기식
      if (dan < 2 || dan > 9) {
        System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
        break;
      }
      // 반복 실행문
      for (int i = 1; i <= 9; i++) {
        System.out.printf("%d x %d = %d\n", dan, i, dan * i);
      }
      // 증감식
      System.out.print("구구단 몇 단을 출력할까요? (2 ~ 9): ");
      dan = in.nextInt();
    }

  } // end main method
} // end class
