package abstract_interface;

public class NoteBook extends Computer implements Portable {
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방 안에 있다.");
  }
  @Override
  public void turnOn() {
    System.out.println("노트북을 켠다.");
  }

  @Override
  public void turnOff() {
    super.turnOff();
  }

  @Override
  public void repair() {
    super.repair();
  }
}
