package abstract_interface;

public class RemoteController implements RemoteControllable {
  public static void main(String[] args) {

  }
  @Override
  public void remoteOn() {
    System.out.println("리모컨를 키다");
  }

  @Override
  public void remoteOff() {
    System.out.println("리모컨을 끄다");
  }

  @Override
  public void turnOn() {
    System.out.println("TV를 키다");
  }

  @Override
  public void turnOff() {

  }
}
