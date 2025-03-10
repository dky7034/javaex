package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    System.out.println(r.nextInt(3)); // 0 - 29
  }
}
