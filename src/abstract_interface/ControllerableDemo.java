package abstract_interface;

public class ControllerableDemo {
  public static void main(String[] args) {
    Controllable computer = new Computer();
    computer.turnOn();
    computer.repair();
    computer.repair();
    Controllable n = new NoteBook();
    n.turnOn();
    n.turnOff();
    n.repair();
    Controllable tv = new TV();
    tv.turnOff();
    tv.turnOn();
    tv.repair();

    Controllable[] controllables = {
        new TV(),
        new Computer(),
        new NoteBook()
    };
    System.out.println("=========================");
    for (Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOff();
      controllable.repair();
    }
  }
}
