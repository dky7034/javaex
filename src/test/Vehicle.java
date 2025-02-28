package test;

public class Vehicle {
  // 필드
  String color;
  int speed;
  // 생성자
  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }
  // getter and setter
  // 메서드
  void show() {
    System.out.println("부모 클래스");
    System.out.println("color = " + color);
    System.out.println("speed = " + speed);
  }
}

class Car extends Vehicle {
  // 필드
  int displacement; // 자동차 배기량
  int gears; // 자동차 기어 단수
  // 생성자
  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }
  // getter and setter
  // 메서드
  @Override
  void show() {
    System.out.println("자식 클래스 - 오버라이드됨");
    System.out.println("color = " + color);
    System.out.println("speed = " + speed);
    System.out.println("displacement = " + displacement);
    System.out.println("gears = " + gears);
  }
}

