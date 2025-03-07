package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    // 시간 체크 (nanoTime)
    long startTime = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      al.add(i);
    }
    long endTime = System.currentTimeMillis();
    System.out.println("배열의 마지막에 원소를 추가하는 데 걸리는 시간: " + (endTime - startTime));

    // 시간 체크
    startTime = System.nanoTime();
    for (int i = 0; i < 100_000; i++) {
      ll.addLast(i);
    }
    endTime = System.currentTimeMillis();
    System.out.println("연결 리스트의 마지막에 원소를 추가하는 데 걸리는 시간: " + (endTime - startTime));
  }
}
