package abstract_interface;

public class InterfaceDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();

    RemoteController remoteController = new RemoteController();
    remoteController.remoteOn();
    remoteController.remoteOff();
    remoteController.repair();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    computer.repair();

  }
}
