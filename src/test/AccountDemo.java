package test;

public class AccountDemo {
  public static void main(String[] args) {
    Account[] accounts = new Account[100];
    accounts[0] = new Account("111-111", "홍길동");
    accounts[0].setBalance(10_000);
    
  }
}
