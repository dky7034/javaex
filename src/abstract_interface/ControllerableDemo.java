package abstract_interface;

public class ControllerableDemo {
  public static void main(String[] args) {
    Controllable computer = new Computer;
    computer.turnOn();
    computer.repair();
    computer.repair();
    Controllable n = new NoteBook();
    n.turnOn();
    n.turnOff();
    n.repair();
    Controllable tv = new Controllable();
    tv.turnOff();
    tv.turnOn();
  }
}
