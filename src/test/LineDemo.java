package test;

public class LineDemo {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);
    if (l1.compareTo(l2) == 0) {
      System.out.println("두 라인의 길이가 같습니다.");
    } else if (l1.compareTo(l2) > 0) {
      System.out.println("l1 라인이 l2 라인보다 깁니다.");
    } else {
      System.out.println("l2 라인이 l1 라인보다 깁니다.");
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
  public int compareTo(Line l) {
    return 0;
  }
}