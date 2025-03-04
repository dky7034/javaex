package abstract_interface;

public interface Vehicle {
  // 반드시 가져야 하는 기능
  void move();
  
}

class Car implements Vehicle {
  @Override
  public void move() {

  }
}
