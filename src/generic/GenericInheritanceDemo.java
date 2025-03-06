package generic;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list1 = new ArrayList<>();
    list1.add(new Beverage()); // 인덱스 0
    list1.add(new Beer());    // 인덱스 1
    list1.add(new Boricha()); // 인덱스 2

    Beverage beverage = list1.get(0);
  }
}
