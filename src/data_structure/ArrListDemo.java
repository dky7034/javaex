package data_structure;

import java.util.ArrayList;

public class ArrListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.get(0);
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    System.out.println("add(값)");
    System.out.println(numbers);

    numbers.add(1, 50);
    System.out.println(numbers);
    numbers.remove(2);
    System.out.println(numbers);
    System.out.println("get(인덱스)");
    System.out.println(numbers.get(2));

  }
}