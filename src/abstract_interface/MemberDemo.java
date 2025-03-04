package abstract_interface;

public class MemberDemo {
  class Eagle extends Bird {
    @Override
    void move() {
      System.out.println("독수리가 난다.");
    }
    Eagle e = new Eagle();
  }
  public static void main(String[] args) {
    MemberDemo m = new MemberDemo();
  }
}
