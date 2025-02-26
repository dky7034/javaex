package oop;

public class CircleDemo {
  public static void main(String[] args) {
    System.out.println("----- circle 객체 -----");
    Circle circle = new Circle(10.0);
    System.out.println("circle.radius = " + circle.getRadius());
    circle.showRadiusAndArea();

    System.out.println("----- circle1 객체 -----");
    Circle circle1 = new Circle(0);
    System.out.println("circle1.radius = " + circle1.getRadius());
    circle1.showRadiusAndArea();
    circle1.setRadius(0);
  }
}
