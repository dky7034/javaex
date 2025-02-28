package etc;

import java.util.Scanner;

public class WhileDemo4 {
  public static void main(String[] args) {
    // 초기식
    Scanner in = new Scanner(System.in);
    // 사용자에게 입력받기
    System.out.print("동물 이름을 입력하세요. (종료하려면 stop 을 입력하세요): ");
    String animal = in.nextLine();
    // while문 - 반복실행문, 조건식(분기문), 증감식
    while(true) {
      // 조건식(분기문)
      if (animal.equalsIgnoreCase("stop")) {
        System.out.println("프로그램을 종료합니다");
        break;
      }
      // 메서드 호출
      whoIsIT(animal);
      // 증감식
      System.out.print("동물 이름을 입력하세요. (종료하려면 stop 을 입력하세요): ");
      animal = in.nextLine();
    }
  } // end main method

  // 메서드 분리
  // 형식: 접근제한자 반환형 메서드명(매개변수1, 매개변수2 ...) {}
  private static void whoIsIT(String animal) {
    String kind = "";
    switch (animal) {
      case "호랑이":
        kind = "포유류";
        break;
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
        break;
      default:
        kind = "분류할 수 없음";
    }
    System.out.printf("%s는 %s 입니다.\n", animal, kind);
  }
} // end class