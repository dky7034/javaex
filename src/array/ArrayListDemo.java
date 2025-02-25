package array;

import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>();
    System.out.println("scores.size() = " + scores.size());
    scores.add(10);
    System.out.println("scores.size() = " + scores.size());
    scores.add(20);
    System.out.println("scores.size() = " + scores.size());
    scores.add(30);
    System.out.println("scores.size() = " + scores.size());
    scores.add(40);
    for (int i = 0; i < scores.size(); i++) {
      System.out.println(scores.get(i));
    }

  }
}
