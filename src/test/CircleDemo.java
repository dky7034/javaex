package test;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    ColorCircle colorCircle = new ColorCircle(10, "빨간색");

    circle.show();
    colorCircle.show();
  }
}
