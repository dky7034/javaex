package exception_handle;

public class CheckedDemo {
  public static void main(String[] args) {

  }
  static void method1() {
    method2();
  }
  static void method2() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String");
  }
}
