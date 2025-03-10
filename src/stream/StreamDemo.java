package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      int number = r.nextInt(30);
      System.out.println(number);
      list.add(number);
    }
    System.out.println(Collections.sort(list););

    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list) {
      if (i > 10) {
        gt10.add(i);
      }
    }
    System.out.println(gt10);

  }
}
