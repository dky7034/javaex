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
}

