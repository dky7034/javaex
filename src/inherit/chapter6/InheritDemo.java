package inherit.chapter6;

public class InheritDemo {
  public static void main(String[] args) {
    // 원
    Circle c = new Circle();
    c.radius = 10.0;
    c.findArea();

    // 구
    Ball b = new Ball(5.0, "yellow");
    System.out.println(b.findColor());
    b.findVolume();
    b.findArea();

  }
}
