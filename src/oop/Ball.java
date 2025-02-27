package oop;

public class Ball {
  // 생성자 (Constructor)
  // 기본생성자는 자동으로 생성 (명시적으로 작성하지 않아도 됨)
  public Ball () {}
  public Ball (double r) {
    radius = r;
  }

  // 필드 (변수)
  public double radius;

  // 메서드 (동작)
  // 인스턴스 메서드
  public double getVolume() {
    return 4 / 3 * 3.14 * radius * radius * radius;
  }
  // static 메서드
  static void print() {
    System.out.println("공입니다.");
  }

}
