package generic;

public class GenericDemo3 {
  public static void main(String[] args) {
    Cup<Boricha> c = new Cup<>();
    Boricha b = new Boricha();

    c.setBeverage(b);
    Boricha boricha = c.getBeverage();

    Beer beer = new Beer();
//    c.setBeverage(beer);
  }
}
