package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    // 시간 체크
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }
    long l1 = System.nanoTime();
  }
}
