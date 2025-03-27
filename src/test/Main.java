package test;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int res1 = calculator.add(5, 3);
    int res2 = calculator.multiply(4, 6);
    System.out.println("res1 = " + res1);
    System.out.println("res2 = " + res2);
  }
}
