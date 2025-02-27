package array;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
  }

  // static 메서드
  static void zero() {
    // 인수 c1이 매개변수 c에 복사된다.
    // c1과 c는 동일한 Circle 객체를 가리킨다.
    // zero() 메서드에서 c.radius 에 0.0을 대입한다.
  }
}
