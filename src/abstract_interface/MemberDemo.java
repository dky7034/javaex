package abstract_interface;

public class MemberDemo {
  class Eagle extends Bird {
    @Override
    void move() {
      System.out.println("독수리가 난다.");
    }
  }
}
