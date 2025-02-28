package test;

public class Circle {
  // 필드
  int radius;

  // 생성자
  public Circle(int radius) {

  }

  // 메서드
  void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }
}

class ColorCircle extends Circle {

}

