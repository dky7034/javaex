package collection_framework;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();

    try {
      q.remove();
    } catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("프로그램 종료");
    }
  }
}
