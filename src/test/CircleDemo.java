package test;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle();
    ColorCircle colorCircle = new ColorCircle();
    Circle[] circles = new Circle[2];
    circles[0] = new Circle(5);
    circles[1] = new ColorCircle(10, "빨간색");

    for (Circle c : circles) {
      System.out.println(c.radius);
      c.show();
    }
  }
}
