package exercise;

import java.util.Arrays;

public class Ex4 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(Arrays.toString(name));
    for (int i = 0; i < 10; i++) {
      double r = (int) Math.floor(Math.random() * 3);
      System.out.println("r = " + r);

    }
  }
}
