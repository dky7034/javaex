package abstract_interface;

public class ComputeController extends Controllable {
  @Override
  public void turnOn() {
    
  }

  @Override
  public void turnOff() {

  }

  @Override
  public void repair() {
    Controllable.super.repair();
  }
}
