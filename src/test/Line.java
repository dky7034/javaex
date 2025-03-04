package test;

public class Line {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    if (a.compareTo(b) == 0) {
      System.out.println("두 객체가 동일합니다.");
    } else if (a.compareTo(b) > 0) {
    }
  }

}

class A implements Comparable {
  @Override
  public int compareTo(Object o) {
    return 0;
  }
}

class B implements Comparable {
  @Override
  public int compareTo(Object o) {
    return 0;
  }
}