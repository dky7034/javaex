package abstract_interface;

public class ParentDemo {
  public static void main(String[] args) {
    Parent p = new Parent() {
      // Parent Class를 상속받은 익명 클래스 → 오버라이딩한 메서드
      @Override
      void method1() {
        super.method1();
      }
    }
  }
}
