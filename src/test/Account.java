package test;

public class Account {
  // 필드
  private int balance;
  // 필드 추가 - 계좌번호, 계좌주
  private String accountNo;
  private String accountOwner;
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
      this.balance = balance;
    }
  }

  public String getAccountNo() {
    return accountNo;
  }

  public String getAccountOwner() {
    return accountOwner;
  }
  // 메서드
  // 입금 기능 추가
  void deposit(int money) {

  }

  // 출금 기능 추가
  void withdraw(int balance) {

  }
}
