package abstract_interface;

public interface Controllable {
  // 필수 기능 - abstract (반드시 포함하도록)
  void turnOn();
  void turnOff();

  // 기능이 구현되어 있는 경우 - default
  default void repair() {
    
  }
}
