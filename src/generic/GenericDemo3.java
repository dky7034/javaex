package generic;

public class GenericDemo3 {
  public static void main(String[] args) {
    Cup<Boricha> borichaCup = new Cup<>();
    Boricha boricha = new Boricha();

    borichaCup.setBeverage(boricha);
    borichaCup.getBeverage().drinkBoricha();

    Beer beer = new Beer();
//    c.setBeverage(beer); // Boricha 가 아닌 객체는 담을 수 없습니다.

    Cup<Beer> beerCup = new Cup<>();
    beerCup.setBeverage(beer);
  }
}
