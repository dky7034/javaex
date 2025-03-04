package abstract_interface;

public class InterfaceDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset();

    RemoteController remoteController = new RemoteController();
    remoteController.remoteOn();
    remoteController.remoteOff();

    Computer computer = new Computer();
    computer.repair();
    computer.turnOn();
    computer.turnOff();


  }
}
