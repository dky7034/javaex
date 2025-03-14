package test;

public class NestedCar {
  public static void main(String[] args) {
    Car car = new Car("스포티지"); // 외부 클래스 인스턴스 생성
//    Car.Engine engine = car.new Engine(); // 외부 클래스 인스턴스 메서드에서 내부 클래스 생성
//    engine.on(); // 내부 클래스 메서드 호출
    car.run(); // 외부 클래스 메서드 호출
  }
}

class Car {
  private String model;

  public Car(String model) {
    this.model = model;
  }

  private class Engine {
    void on() {
      System.out.println(model + " 시동 on");
    }
  }

  void run() {
    Engine engine = new Engine();
    engine.on();
    System.out.println(model + " 주행 중");
  }

}
