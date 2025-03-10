package test;

public class T0 {
  public static void main(String[] args) {
    T0class t0class = new T0class();
    boolean b = t0class.isLongEnough("String");
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
interface T0interface {
  boolean isLongEnough(String str);
}

class T0class implements T0interface {
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