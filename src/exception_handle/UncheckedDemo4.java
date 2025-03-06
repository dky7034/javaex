package exception_handle;

import java.util.Scanner;

public class UncheckedDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력하세요: ");
    String input = in.nextLine();
    System.out.println(square(input));
  }

  private static int square(String input) {
    int i = Integer.parseInt(input);
    return i * i;
  }

}
