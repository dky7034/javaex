package test;

public class NestedClassExample1 {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.createInner(); // 외부 클래스가 내부 클래스를 관리해줌
    Outer.Inner inner = outer.new Inner();
    inner.display();
  }
}

class Outer {
  class Inner {
    void display() {
      System.out.println("인스턴스 멤버 클래스");
    }
  }

  void createInner() {
    Inner inner = new Inner();
    inner.display();
  }
}
