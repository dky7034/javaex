package test;

public class NestedClassExample {
  public static void main(String[] args) {
    // ✅ 1. 정적 중첩 클래스 사용 (static nested class)
    NestedClass.StaticNestedClass staticNested = new NestedClass.StaticNestedClass();
    staticNested.show(); // 출력: 정적 중첩 클래스

    // ✅ 외부 클래스 인스턴스 생성 후 메서드 호출
    NestedClass nestedClass = new NestedClass();
    nestedClass.show(); // 출력: 정적 중첩 클래스의 외부 클래스

    // ✅ 2. 비정적 내부 클래스 사용 (inner class)
    NestedClass1 outer = new NestedClass1(); // 외부 클래스 인스턴스 생성
    NestedClass1.Inner inner = outer.new Inner(); // 내부 클래스 인스턴스 생성
    inner.show(); // 출력: 내부 클래스
    outer.show(); // 출력: 일반 중첩 클래스의 외부 클래스

    // ✅ 3. 익명 클래스 사용 (anonymous class)
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("익명 클래스 실행");
      }
    };
    runnable.run(); // 출력: 익명 클래스 실행

    // ✅ 4. 지역 내부 클래스 사용 (local inner class)
    NestedClass2 localOuter = new NestedClass2();
    localOuter.method(); // 출력: 로컬 클래스
    localOuter.show();   // 출력: 로컬 클래스의 외부 클래스
  }
}

// ✅ 1. 정적 중첩 클래스 (Static Nested Class)
class NestedClass {
  // 정적 중첩 클래스: 외부 클래스와 독립적으로 동작 (static 키워드)
  static class StaticNestedClass {
    void show() {
      System.out.println("정적 중첩 클래스");
    }
  }

  // 외부 클래스
  void show() {
    System.out.println("정적 중첩 클래스의 외부 클래스");
  }
}

// ✅ 2. 비정적 내부 클래스 (Inner Class)
class NestedClass1 {
  // 인스턴스 내부 클래스: 외부 클래스 인스턴스와 연결됨
  class Inner {
    void show() {
      System.out.println("내부 클래스");
    }
  }

  void show() {
    System.out.println("일반 중첩 클래스의 외부 클래스");
  }
}

// ✅ 3. 지역 내부 클래스 (Local Inner Class)
class NestedClass2 {
  void method() {
    // 메서드 안에 정의된 지역 내부 클래스
    class LocalInnerClass {
      void show() {
        System.out.println("로컬 클래스");
      }
    }

    // 메서드 내에서 객체 생성 및 사용
    LocalInnerClass localInner = new LocalInnerClass();
    localInner.show(); // 출력: 로컬 클래스
  }

  void show() {
    System.out.println("로컬 클래스의 외부 클래스");
  }
}