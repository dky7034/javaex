package abstract_interface;

public interface Coin {
  // 인터페이스에서 상수 앞에는 public static final이 생략되어 있고, 컴파일러가 나중에 추가해 줍니다.
  int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
}
