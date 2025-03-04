package abstract_interface;

public class ComputeController implements Controllable {
  @Override
  public void turnOn() {

  }

  @Override
  public void turnOff() {

  }

  @Override
  public void repair() {
    System.out.println("컴퓨터를 수리한다.");
  }
}
