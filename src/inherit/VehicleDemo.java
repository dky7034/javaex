package inherit;

public class VehicleDemo {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    System.out.println(v1.name);

    Vehicle v = new Car();
    System.out.println(v.name); // 부모 클래스의 멤버 호출
    v.whoami();
  }
}
