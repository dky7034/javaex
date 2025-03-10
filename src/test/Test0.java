package test;

public class Test0 {
  public static void main(String[] args) {
    Test0class test0class = new Test0class();
    boolean b = test0class.isLongEnough("String");
    System.out.println("b = " + b); // b = true

    AbstractClass abstractClass = new AbstractClass() {
      @Override
      void abstractMethod1() {
        System.out.println("abstractMethod1");
      }
      @Override
      void abstractMethod2() {
        System.out.println("abstractMethod2");
      }
    };
    abstractClass.abstractMethod1(); // abstractMethod1
    abstractClass.abstractMethod2(); // abstractMethod2
    abstractClass.method1(); // ""

    Test0Class test0Class = new Test0Class() {
      @Override
      void test0Method1() {
        System.out.println("test0Method1Override");
      }
    };
    test0Class.test0Method1(); // test0Method1Override
    test0Class.test0Method2(); // ""
  }
}

@FunctionalInterface
interface Test0interface {
  boolean isLongEnough(String str);
}

class Test0class implements Test0interface {
  @Override
  public boolean isLongEnough(String str) {
    return str.length() >= 5;
  }
}

abstract class AbstractClass {
  abstract void abstractMethod1();
  abstract void abstractMethod2();
  void method1() {}
}

class Test0Class {
  static void staticTest0Method() {}
  void test0Method1() {}
  void test0Method2() {}
}