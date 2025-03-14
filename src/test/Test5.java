package test;

public class Test5 {
  public static void main(String[] args) {
    OuterOfTest5 outerOfTest5 = new OuterOfTest5();
    outerOfTest5.createInner();
  }
}

class OuterOfTest5 {
  void show() {
    System.out.println("Outer 클래스 메서드입니다.");
  }

  void createInner() {
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println(this); // 익명 클래스의 인스턴스
        OuterOfTest5.this.show(); // 외부 클래스의 인스턴스 메서드 호출
      }
    };

    runnable.run();
  }
}