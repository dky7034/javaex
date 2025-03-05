package exception_handle;

public class UncheckedDemo2 {
  public static void main(String[] args) {

  }

  static void method1() {

  }

  static void method2() throws ArithmeticException {
    int i = 1 / 0; // ArithmeticException
  }
}
