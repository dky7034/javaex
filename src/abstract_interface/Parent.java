package abstract_interface;

public class Parent {
  void method1() {
    System.out.println("부모입니다.");
  }
}

class OnlyOnce extends Parent {
  @Override
  void method1() {
    super.method1();
  }
}

