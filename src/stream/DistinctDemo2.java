package stream;

import java.util.stream.Stream;

public class DistinctDemo2 {
  public static void main(String[] args) {
    Stream<Circle> cs = Stream.of(new Circle(3), new Circle(5), new Circle(3));
  }
}

class Circle {
  int r;
  public Circle(int r) {
    this.r = r;
  }
}