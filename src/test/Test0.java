package test;

public class Test0 {
  public static void main(String[] args) {
    Test0class Test0class = new Test0class();
    boolean b = Test0class.isLongEnough("String");
    System.out.println("b = " + b);

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

    abstractClass.abstractMethod1();
    abstractClass.abstractMethod2();
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
  void test0Method1() {
    System.out.println("test0Method1");
  }
}