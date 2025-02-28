package test;

public class Account {
  // 필드
  private int balance;
  // 상수 선언
  final static int MIN_BALANCE = 0;
  final static int MAX_BALANCE = 1_000_000;
  // 생성자

  // getter and setter
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    if (!(balance < MIN_BALANCE || balance > MAX_BALANCE)) {
    } else {
      this.balance = balance;
    }
  }

  // 메서드
}

enum Balance {
  MIN_BALANCE, MAX_BALANCE
}
