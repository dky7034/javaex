package exception_handle;

public class UncheckedDemo {
  public static void main(String[] args) {
    int number = 0;
    int result = 0;
    try {
      result = 1 / number;
      result = 2 / number;
      result = 3 / number;
    } catch (ArithmeticException e) {
      e.printStackTrace();
      System.out.println("-------------");
      System.out.println(e.getMessage());
    }
//    int number = 0;
//    if (number == 0) {
//      System.out.println("0으로 나눌 수 없습니다.");
//    } else {
//      int result = 3 / number;
//    }

  }
}