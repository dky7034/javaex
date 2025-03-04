package test;

public class Line {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    if (a.compareTo(b) == 0) {

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