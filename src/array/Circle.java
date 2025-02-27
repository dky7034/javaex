package array;

public class Circle {
  // 생성자 (원의 반지름 초기화)
  public Circle(double radius) {
    this.radius = radius;
  }

  // 필드 - 반지름
  private double radius;

  // setter
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // 메서드
  // 반지름을 구하는 메서드
  public double getRadius() {
    return radius;
  }
  // 넓이를 구하는 메서드
  public double findArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public String toString() {
    return "원의 반지름은 " + radius + "이고, " + "원의 넓이는 " + findArea() + "입니다.";
  }
}
