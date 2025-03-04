package test;

public class Line {
  public static void main(String[] args) {
    A a = new A();
    if (a.compareTo(b) == 0) {
      System.out.println("두 객체가 동일합니다.");
    } else if (a.compareTo(b) > 0) {
      System.out.println("a 가 b 객체보다 더 큽니다.");
    } else {
      System.out.println("b 가 a 객체보다 더 큽니다.");
    }
  }

}

class A implements Comparable {
  @Override
  public int compareTo(Object o) {
    return 0;
  }
}