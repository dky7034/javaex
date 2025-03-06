package exception_handle;

import java.util.Scanner;

public class UncheckedDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("숫자를 입력하세요: ");
    String input = in.nextLine();
    try {
      System.out.println(square(input));
    } catch (NumberFormatException e) {
      System.out.println("숫자(정수)를 입력해 주세요.");
    } finally {
    }
  }

  private static int square(String input) throws NumberFormatException {
    int i = Integer.parseInt(input);
    return i * i;
  }

}
