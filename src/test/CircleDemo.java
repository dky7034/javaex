package test;

public class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    ColorCircle colorCircle = new ColorCircle(10, "빨간색");
    
    for (Circle c : circles) {
      System.out.println(c.radius);
      c.show();
    }
  }
}
