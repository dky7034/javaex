package abstract_interface;

public class AbstractDemo {
  public static void main(String[] args) {
    Shape shape = new Shape() {
      @Override
      void draw() {
        
      }
    };
  }
}

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
