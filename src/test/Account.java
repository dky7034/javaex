package test;

public class Account {
  // 필드
  private int balance;
  // 생성자

  // getter and setter
  public int getBalance() {
    return balance;
  }
  public void setBalance(int balance) {
    this.balance = balance;
  }

  // 메서드
}

enum Balance {
  MIN_BALANCE, MAX_BALANCE
}
