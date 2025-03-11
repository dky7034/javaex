package test;

public class NestedTest0 {
  public static void main(String[] args) {

  }
}

class NestedClass {
  static class StaticNestedClass {
    void show() {
      System.out.println("정적 중첩 클래스");
    }
  }
  int a;
  void show() {
    System.out.println("정적 중첩 클래스의 외부 클래스");
  }
}
