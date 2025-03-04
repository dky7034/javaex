package abstract_interface;

public class MoveableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(4);

    System.out.println("----------");

    Car c = (Car) m;
    c.move(5);
    c.show();
  }
}
