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
  abstract double findArea();
  abstract void draw();
}

class Circle extends Shape {
  int radius;
  @Override
  double findArea() {
    return pi * radius * radius;
  }
  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }
}

class Rectangle extends Shape {
  int a;
  int b;
  @Override
  double findArea() {
    return ;
  }
  @Override
  void draw() {
    System.out.println("사각형을 그리다.");
  }
}
