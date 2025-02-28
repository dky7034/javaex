package etc;

public class MethodDemo1 {
  public static void main(String[] args) {
    method1();
    int i = add(2, 3);
    System.out.println("i = " + i);
  } // end of method

  static void method1() {
    System.out.println("반환값이 없는 method가 호출되었습니다.");
    return;
  }

  static int add(int num1, int num2) {
    return num1 + num2;
  }
} // end of class
