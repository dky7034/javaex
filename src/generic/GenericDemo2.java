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
    Beer beer1 = (Beer) c.getBeverage(); // 다운캐스팅은 컴파일이 걸러주지 않는 실행 오류
    beer1.drinkBeer();                   // 컴파일할 때 걸러질 수 있는 오류로 만들기 위해 제네릭 클래스를 사용

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
