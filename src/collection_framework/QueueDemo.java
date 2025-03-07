package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();

    if (!q.isEmpty()) {
      q.remove();
    } else {
      System.out.println("큐가 비어있습니다.");
    }

    System.out.println(q.poll());

    q.add("1");
    q.add("2");
    q.add("3");

    while (!q.isEmpty()) {
      System.out.println(q.poll());
    }

    q.remove(); // remove: 첫 번째 요소를 삭제
    System.out.println("q = " + q);
  }
}
