package abstract_interface;

public class LocalAnonymousDemo {
  public static void main(String[] args) {
    Bird b = new Bird() {
      @Override
      void move() {
        System.out.println("독수리가 난다.");
      }
    };


  }
}
