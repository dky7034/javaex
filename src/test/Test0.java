//package test;
//
//public class Test0 {
//  public static void main(String[] args) {
//    // 일반적인 메서드 사용법
//    // 해당 메서드를 가진 클래스의 객체를 생성하고, 객체명으로 메서드를 호출함
//    Test0Class test0Class = new Test0Class();
//    boolean b = test0Class.isLongEnough("String");
//    System.out.println("b = " + b); // b = true
//
//    // 함수형 인터페이스에서 익명 클래스 사용
//    Test0interface test0interface = new Test0interface() {
//      @Override
//      public boolean isLongEnough(String str) {
//        return str.length() >= 5;
//      }
//    };
//    boolean b1 = test0interface.isLongEnough("two");
//    System.out.println("b1 = " + b1); // b1 = false
//
//    // 람다식 사용 (람다식은 익명 클래스와 달리 함수형 인터페이스에서만 사용 가능)
//    Test0interface test0interface1 = s -> s.length() >= 5;
//    boolean b2 = test0interface1.isLongEnough("good");
//    System.out.println("b2 = " + b2); // b2 = false
//
//    // 추상 클래스에서도 익명 클래스를 사용할 수 있음
//    AbstractClass abstractClass = new AbstractClass() {
//      @Override
//      void abstractMethod1() {
//        System.out.println("abstractMethod1");
//      }
//      @Override
//      void abstractMethod2() {
//        System.out.println("abstractMethod2");
//      }
//    };
//    abstractClass.abstractMethod1(); // abstractMethod1
//    abstractClass.abstractMethod2(); // abstractMethod2
//    abstractClass.method1(); // "==="
//
//    // 일반 클래스에서도 익명 클래스를 사용할 수 있음
//    NormalClass normalClass = new NormalClass() {
//      @Override
//      void test0Method1() {
//        System.out.println("test0Method1Override");
//      }
//    };
//    normalClass.test0Method1(); // test0Method1Override
//    normalClass.test0Method2(); // "---"
//  }
//}
//
//@FunctionalInterface
//interface Test0interface {
//  boolean isLongEnough(String str);
//}
//
//class Test0Class implements Test0interface {
//  @Override
//  public boolean isLongEnough(String str) {
//    return str.length() >= 5;
//  }
//}
//
//abstract class AbstractClass {
//  abstract void abstractMethod1();
//  abstract void abstractMethod2();
//  void method1() {
//    System.out.println("===");
//  }
//}
//
//class NormalClass {
//  static void staticTest0Method() {}
//  void test0Method1() {}
//  void test0Method2() {
//    System.out.println("---");
//  }
//}