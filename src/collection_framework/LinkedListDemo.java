package collection_framework;

import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.addFirst(10);
    list.addFirst(20);
    list.addFirst(30);

    System.out.println("addFirst 후:");
    for (Integer i : list) {
      System.out.println(i);
    }

    list.clear();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);

    System.out.println("addLast 후:");
    for (Integer i : list) {
      System.out.println(i);
    }

    

  } // end of main method
} // end of class
