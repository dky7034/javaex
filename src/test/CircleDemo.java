package test;

public class CircleDemo {
  public static void main(String[] args) {
    Circle[] circles = new Circle[2];
    circles[0] = new Circle(5);
    circles[1] = new ColorCircle(10, "빨간색");

    for (Circle circle : circles) {
      System.out.println();
      
    }
  }
}
