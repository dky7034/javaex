package generic;

public class GenericDemo3 {
  public static void main(String[] args) {
    Cup<Boricha> borichaCup = new Cup<>();
    Boricha boricha = new Boricha();

    borichaCup.setBeverage(boricha);
    borichaCup.getBeverage().drinkBoricha();

    Cup<Beer> beerCup = new Cup<>();
    Beer beer = new Beer();

    beerCup.setBeverage(beer);
    beerCup.getBeverage().drinkBeer();
  }
}
