package abstract_interface;

public class TV implements Controllable {
  @Override
  public void turnOn() {
    System.out.println("TV를 켜다.");
  }

  @Override
  public void turnOff() {
    System.out.println("TV를 끄다.");
  }

  @Override
  public void repair() {
    System.out.println("TV를 수리한다");
  }
}
