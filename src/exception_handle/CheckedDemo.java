package exception_handle;

public class CheckedDemo {
  public static void main(String[] args) {
    try {
      method1();
    } catch (ClassNotFoundException e) {
      System.out.println("해당 클래스는 존재하지 않습니다.");
    }
  }
  static void method1() throws ClassNotFoundException {
    method2();
  }
  static void method2() throws ClassNotFoundException {
    Class clazz = Class.forName("java.lang.String");
  }
}
