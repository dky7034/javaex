package generic;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup c = new Cup();

    Beer beer = new Beer();
    c.setBeverage(beer);

    Boricha boricha = new Boricha();
    c.setBeverage(boricha);
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

}
