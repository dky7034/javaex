package test;

public class AccountDemo {
  public static void main(String[] args) {
    Account account = new Account();
    account.setBalance(1000);
    System.out.println("잔액: " + account.getBalance());
    account.setBalance(-100);
    System.out.println("잔액: " + account.getBalance());
    account.setBalance();
    System.out.println("잔액: " + account.getBalance());
    account.setBalance();
    System.out.println("잔액: " + account.getBalance());

  }
}
