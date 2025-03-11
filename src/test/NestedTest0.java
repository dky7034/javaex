package test;

public class NestedTest0 {
  public static void main(String[] args) {
    NestedClass.StaticNestedClass nestedClass = new NestedClass.StaticNestedClass();
    nestedClass.show();
    NestedClass nestedClass1 = new NestedClass();
    nestedClass1.show();

    NestedClass1.Inner inner = new NestedClass1();

  }
}

class NestedClass {
  static class StaticNestedClass {
    void show() {
      System.out.println("정적 중첩 클래스");
    }
  }
  int a = 0;
  void show() {
    System.out.println("정적 중첩 클래스의 외부 클래스");
  }
}

class NestedClass1 {
  class Inner {
    void show() {
      System.out.println("내부 클래스");
    }
  }

  void show() {
    System.out.println("일반 중첩 클래스의 외부 클래스");
  }
}
