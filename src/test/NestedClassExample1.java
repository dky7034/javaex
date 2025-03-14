package test;

public class NestedClassExample1 {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.createInner(); // 외부 클래스가 내부 클래스를 관리해줌
//    Outer.Inner inner = outer.new Inner();
//    inner.display();
  }
}

class Outer {
  class A {
    // [접근제한자] [static] interface 인터페이스이름
    public interface B {
      // 상수 필드
      // 추상 메서드
      // 디폴트 메서드 (Java 8~)
      // 정적 메서드 (Java 8~)
    }
  }

  private class Inner {
    void display() {
      System.out.println("인스턴스 멤버 클래스");
    }
  }

  void createInner() {
    Inner inner = new Inner(); // 외부 클래스 내부에서만 사용 가능
    inner.display();
  }
}


