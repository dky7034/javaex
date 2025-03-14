package data_structure;

import java.util.ArrayList;

public class ArrListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    System.out.println("add(값)");
    System.out.println(numbers);

    numbers.add(1, 50);
    numbers.remove(2);
  }
}