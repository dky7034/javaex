package inherit.chapter6;

public class Circle {
  double radius;
  public double findRadius() {
    return radius;
  }

  void findArea() {
    System.out.println("넓이는 " + (Math.PI * radius * radius) + "입니다.");
  }
}
