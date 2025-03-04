package abstract_interface;

public interface Controllable {
  // 필수 기능 - abstract (반드시 포함하도록)
  void turnOn();
  void turnOff();

  // 기능이 구현되어 있는 경우 - default (오버라이딩 가능)
  default void repair() {
    System.out.println("전자제품을 수리한다.");
  }

  // 오버라이딩 대상이 아닌 경우 - static (오버라이딩 불가능)
  static void reset() {
    System.out.println("전자제품을 초기화한다.");
  }

  // 인터페이스 내부에서만 사용하고 구현이나 상속의 대상이 아닌 경우 - private
  private void printInformation(String informatino) {
    System.out.println();
  }

}
