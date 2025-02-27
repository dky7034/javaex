package inherit.chapter6;

public class Ball extends Circle {
  private String color;

  public Ball(double radius, String color) {
    super.radius = radius;
    this.color = color;
  }

  public String findColor() {
    return color;
  }

  public void findVolume() {
    System.out.println("구의 부피는 " + 3 / (double)4 * Math.PI * radius * radius * radius + "입니다.");
  }

  @Override

  @Override
  public void findArea() {
    super.findArea();
  }
}
