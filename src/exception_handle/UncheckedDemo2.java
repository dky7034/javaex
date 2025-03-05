package exception_handle;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    try {
      method1();
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }

  static void method1() throws ArithmeticException {
    method2();
  }

  static void method2() throws ArithmeticException {
    int i = 1 / 0; // ArithmeticException
  }
}
