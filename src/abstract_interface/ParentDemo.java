package abstract_interface;

public class ParentDemo {
  public static void main(String[] args) {
    Parent p = new Parent() {
      // Parent Class 를 상속받은 익명 클래스 → 오버라이딩한 메서드
      @Override
      void method1() {
        System.out.println("한 번만 호출됩니다.");
      }
    };
    p.method1(); // 한 번만 호출됩니다.

    Parent parent = new Parent();
    parent.method1(); // 부모입니다.

    ParentInterface pi = new ParentInterface() {
      // ParentInterface 를 구현한 클래스 안에 있는 메서드 - 오버라이딩
      @Override
      public void method1() {
        System.out.println("한 번만 호출됩니다.");
      }
    }

  } // end of main method
} // end of class
