package inherit;

public class PolymorDemo {
  public static void main(String[] args) {
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Vehicle();
    vehicles[1] = new Car(); // 업캐스팅
    vehicles[2] = new SportsCar(); // 업캐스팅

    int count = 0;
    for (Vehicle v : vehicles) {
      System.out.printf("인덱스 %d번 출력: \n", count);
      v.whoami();
      v.move();
      count++;
      System.out.println("====================");
    }
  }
}
