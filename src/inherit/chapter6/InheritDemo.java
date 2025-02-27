package inherit.chapter6;

public class InheritDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
    c.radius = 10.0;
    c.findArea();

    Ball b = new Ball(5.0, "yellow");
    System.out.println("b = " + b);
    b.findArea();

  }
}
