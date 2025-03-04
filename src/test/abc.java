package test;

public class abc implements C {
  public static void main(String[] args) {
    System.out.println(A.value);
    System.out.println(B.value);
//    System.out.println(C.value);
  }
}

interface A {
  int value = 10;
  default void showMessage() {
    System.out.println("A 인터페이스의 메시지");
  }
}

interface B {
  int value = 20;
  default void showMessage() {
    System.out.println("B 인터페이스의 메시지");
  }
}

interface C extends A, B {
  @Override
  default void showMessage() {
    System.out.println("C 인터페이스에서 충돌 해결");
  }
}
