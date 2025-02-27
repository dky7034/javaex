package inherit.chapter6;

public class Circle {
  public double radius;

  public double findRadius() {
    return radius;
  }

  public void findArea() {
    System.out.println("원의 넓이는 " + (Math.PI * radius * radius) + "입니다.");
  }
}
