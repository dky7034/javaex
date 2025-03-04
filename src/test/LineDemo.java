package test;

public class LineDemo {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);
    if (l1.compareTo(l2) == 0) {
      System.out.println("두 객체가 동일합니다.");
    } else if (l1.compareTo(l2) > 0) {
      System.out.println("a 가 b 객체보다 더 큽니다.");
    } else {
      System.out.println("b 가 a 객체보다 더 큽니다.");
    }
  }

}

class Line implements Comparable {
  // 필드
  int length;

  // 생성자
  public Line(int length) {
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}