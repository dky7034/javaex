package exception_handle;

public class CheckedDemo {
  public static void main(String[] args) {
    method1();
  }
  static void method1() throws ClassNotFoundException {
    method2();
  }
  static void method2() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String");
  }
}
