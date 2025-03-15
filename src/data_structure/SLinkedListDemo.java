package data_structure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addFirst(10);
    ll.addFirst(20);
    System.out.println(ll);
    ll.removeFirst();
    System.out.println(ll);

    SLinkedList<Integer> sl = new SLinkedList<>();
    sl.addFirst(10);
    System.out.println(sl);

    sl.addFirst(20);
    System.out.println(sl);
    sl.addLast(30);
    System.out.println(sl);
    System.out.println(sl.getValue(2));

    sl.add(1, 40);
    sl.add(2, 50);
    sl.add(4, 60);
    sl.add(6, 70);
    
    System.out.println(sl);
  }
}