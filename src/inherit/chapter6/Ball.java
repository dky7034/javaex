package inherit.chapter6;

public class Ball extends Circle {
  private String color;
  public String findColor() {
    return color;
  }
  public void findVolume() {
    return 3 / 4 * Math.PI * radius * radius * radius;
  }
}
