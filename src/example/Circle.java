package example;

import java.util.Objects;

public class Circle {
  // 필드
  int radius;
  String color;

  public Circle(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  // 생성자
  public Circle(int radius) {
    this.radius = radius;
  }
  // 메서드
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;


  }


  @Override
  public int hashCode() {
    return Objects.hashCode(radius);
  }
}
