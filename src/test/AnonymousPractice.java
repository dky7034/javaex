package test;

public class AnonymousPractice {
  public static void main(String[] args) {
    NormalInterface normalInterface = new NormalInterface() {
      @Override
      public void show() {
        System.out.println("일반 인터페이스");
      }

      @Override
      public void show2() {
        System.out.println("일반 인터페이스1");
      }
    };

    FunctionalInterface functionalInterface = new FunctionalInterface() {
      @Override
      public void show() {
        System.out.println("익명클래스: 함수형 인터페이스");
      }
    };
    // 람다식: 람다식은 오직 함수형 인터페이스에서만 사용 가능
    FunctionalInterface functionalInterface1 = () -> System.out.println("익명클래스: 함수형 인터페이스");

    AbstractClass abstractClass = new AbstractClass() {
      @Override
      void show() {
        System.out.println("익명클래스: 추상클래스");
      }
    };

    NormalClass normalClass = new NormalClass() {
      @Override
      void show() {
        System.out.println("익명클래스: 일반클래스");
      }
    };

  } // end of main method
} // end of class

// 일반 인터페이스 작성
interface NormalInterface {
  void show();
  void show2();
}

// 함수형 인터페이스(추상 메서드를 하나만 가지는 인터페이스) 작성
@java.lang.FunctionalInterface
interface FunctionalInterface {
  void show();
}

// 추상 클래스(추상 메서드를 하나 또는 그 이상 포함할 수 있는 클래스) 작성
abstract class AbstractClass {
  abstract void show();
}

// 일반 클래스 작성
class NormalClass {
  // 메서드
  void show() {
    System.out.println("일반 클래스입니다.");
  }
}