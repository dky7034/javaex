package example;

import java.util.Objects;

public class Circle {
  // 필드
  int radius;
  // 생성자
  public Circle(int radius) {
    this.radius = radius;
  }
  // 메서드
  @Override
  public boolean equals(Object o) {
    if (o instanceof Circle) {
      Circle c = (Circle) o;
      if (c.radius == this.radius) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int hashCode(Object o) {
    return Objects.hashCode(o);
  }
}
