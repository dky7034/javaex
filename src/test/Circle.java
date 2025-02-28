package test;

public class Circle {
  // 필드
  int radius;

  // 생성자
  public Circle(int radius) {
    this.radius = radius;
  }

  // 메서드
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
}

class ColorCircle extends Circle {
  // 필드
  String color;

  // 생성자 오버로딩
  public ColorCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }
  // 메서드 오버라이딩
  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
  }
}

