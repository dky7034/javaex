package oop;

public class Circle {
  // 원의 반지름과 넓이를 구하고자 한다.
  // 원이 생성될 때 크기가 정해진다.
  // 원의 넓이는 0보다 커야 한다.
  // 원의 반지름과 넓이를 출력하는 기능 추가

  // 생성자
  public Circle(double radius) {
    if (radius <= 0) {
      this.radius = 1.0;
    } else {
      this.radius = radius; // 객체의 인스턴스 변수에 생성자의 매개변수 값을 넣음
    }
    findArea();
  }

  // 필드
  private double radius;


  // getter and setter
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0보다 커야 합니다.");
      return;
    }
    this.radius = radius;
  }

  // 메서드
  private double findArea() {
    final double PI = Math.PI;
    double circleArea = PI * radius * radius;
    return circleArea;
  }

  // 원의 반지름과 넓이를 출력하는 메서드
  void showRadiusAndArea() {
    double area = findArea();
    System.out.printf("원의 반지름은 %4.1f 이고 원의 넓이는 %.2f 입니다.\n", radius, area);
  }

}
