package test;

public class ConcreteDemo {
  public static void main(String[] args) {
    Abstract a = new Concrete(10, 20);
    Concrete c = new Concrete(1, 2);
  }
}
