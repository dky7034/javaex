package test;

public class NestedStatic {
  public static void main(String[] args) {
    NestedStaticOuter nso = new NestedStaticOuter("a", 1);
    NestedStaticOuter.NestedStaticInner nsi = new NestedStaticOuter.NestedStaticInner();
    nsi.method();
  }
}

class NestedStaticOuter {
  private String o1;
  private int o2;
  static private String o3;

  public NestedStaticOuter(String o1, int o2) {
    this.o1 = o1;
    this.o2 = o2;
  }

  // 정적 멤버 클래스는 외부 클래스의 멤버에 접근할 수 없습니다.
  // 외부 클래스의 정적 멤버에만 접근 가능합니다.
  static class NestedStaticInner {
    private int i;
    String s;

    void method() {
      o3 = "abc";
      System.out.println(o3); // abc
      System.out.println("이너 클래스의 메서드입니다.");
    }

  }
}