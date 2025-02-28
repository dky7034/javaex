package abstract_interface;

public class AbstractDemo {
  public static void main(String[] args) {
//    Shape shape = new Shape() {}
  }
}

// 추상 클래스 - 다른 클래스를 만들 때 도움을 줄 목적으로 만드는 클래스
abstract class Shape {
  // 필드
  double pi = 3.14;

  // 메서드
  public double findArea() {
    return 0.0;
  }
  // 추상 메서드
  abstract void draw();
}

class Circle extends Shape {
  // 추상메서드 오버라이드
  @Override
  void draw() {

  }
}

class Rectangle extends Shape {
  // 추상메서드 오버라이드
  @Override
  void draw() {
  }
}
