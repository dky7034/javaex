package exception_handle;

public class UncheckedDemo {
  public static void main(String[] args) {
//    try {
//      int i = 1 / 0;
//    } catch (ArithmeticException e) {
//      System.out.println(e.getMessage());
//    }
    int number = 0;
    if (number == 0) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else {
      int result = 3 / number;
    }
  }

}