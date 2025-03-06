package generic;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup c = new Cup();

    Beer beer = new Beer();
    c.setBeverage(beer);
    c.getBeverage().drink();
    Object beverage1 = c.getBeverage();

    Boricha boricha = new Boricha();
    c.setBeverage(boricha);

    Beverage beverage = new Beverage();
    c.setBeverage(beverage);

  }
}

class Cup {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }

}

class Beverage {

}

class Boricha extends Beverage {

}

class Beer extends Beverage {
  public void drink() {
    System.out.println("Beer 를 마신다.");
  }
}
