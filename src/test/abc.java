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
    
  }
}

interface B {
  int value = 20;
}

interface C extends A, B {

}
