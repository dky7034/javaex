package test;

public class Circle {
  // 필드
  int radius;

  // 생성자
  public Circle(int radius) {
  }

  // 메서드
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
}

class ColorCircle extends Circle {
  int radius;
  String color;

  // 생성자 오버로딩
  public ColorCircle(int radius, String color) {

  }
  // 메서드
  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인" + color + "원이다.");
  }
}

