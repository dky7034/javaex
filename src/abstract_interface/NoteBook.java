package abstract_interface;

public class NoteBook extends Computer implements Portable {
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방 안에 있다.");
  }
  
}
