package abstract_interface;

public class CoinDemo2 implements Coin {
  public static void main(String[] args) {
    System.out.println("Dime은 " + Coin.DIME + "센트입니다.");
    System.out.println("Quarter는 " + Coin.QUARTER + "센트입니다.");
  }
}
