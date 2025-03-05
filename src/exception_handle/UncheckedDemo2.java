package exception_handle;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    try {
      method1();
    } catch (ArithmeticException e) {
      System.out.println("0으로 나누면 안됩니다.");
    }
  }

  static void method1() throws ArithmeticException, IndexOutOfBoundsException, NullPointerException, IllegalArgumentException {
    method2();
  }

  static void method2() throws ArithmeticException, IndexOutOfBoundsException, NullPointerException, IllegalArgumentException {
    int i = 1 / 0; // ArithmeticException
    System.out.println(i);
  }
}
