import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    int num = 1;
    if (num == 1) System.out.println("if문에 속한 문장이 하나이면 중괄호를 생략할 수 있습니다.");;

    // 사용자에게 입력받기
    Scanner in = new Scanner(System.in);
    System.out.print("문자를 입력하세요: ");
    String str = in.nextLine();
    if (str.equals("kosta")) {
      System.out.printf("입력값은 %s입니다.", str);
    }
  }
}
