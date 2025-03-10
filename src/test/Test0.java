package test;

public class Test0 {
  public static void main(String[] args) {
    test0Class test0class = new test0Class();
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

  }
}

@FunctionalInterface
interface Test0interface {
  boolean isLongEnough(String str);
}

class test0Class implements Test0interface {
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