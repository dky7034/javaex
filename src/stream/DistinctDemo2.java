package stream;

import java.util.Objects;
import java.util.stream.Stream;

public class DistinctDemo2 {
  public static void main(String[] args) {
    Stream<Circle> cs = Stream.of(
        new Circle(3),
        new Circle(5),
        new Circle(3),
        new Circle(4),
        new Circle(8)
    );
    // 스트림 연산 시작
//    cs.distinct().forEach(circle -> System.out.println(circle));
    cs.filter(c -> c.getR() % 2 == 0) // 반지름이 짝수인 것만 걸러내기
        .distinct()
        .forEach(System.out::println);
  }
}

class Circle {
  private int r;
  public Circle(int r) {
    this.r = r;
  }

  public int getR() {
    return this.r;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "r=" + r +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Circle circle = (Circle) o;
    return r == circle.r;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(r);
  }
}