package abstract_interface;

public class AnonymousDemo {
  Bird b = new Bird() {
    @Override
    void move() {
      System.out.println("어떤 새가 난다.");
    }
  };
}
