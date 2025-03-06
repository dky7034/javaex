package generic;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup c = new Cup();

    Beer beer = new Beer();
    c.setBeverage(beer);
//    c.getBeverage().drink();

    Beer b = (Beer) c.getBeverage();
    b.drinkBeer();

    Boricha boricha = new Boricha();
    c.setBeverage(boricha);

    Boricha br = (Boricha) c.getBeverage();
    boricha.drinkBoricha();
    
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
  public void drinkBoricha() {
    System.out.println("Boricha 를 마신다");
  }
}

class Beer extends Beverage {
  public void drinkBeer() {
    System.out.println("Beer 를 마신다.");
  }
}
