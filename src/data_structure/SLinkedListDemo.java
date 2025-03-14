package data_structure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    System.out.println(linkedList.size());

    SLinkedList<Integer> sLinkedList = new SLinkedList<>();
    System.out.println(sLinkedList.size());
    sLinkedList.addFirst(1);
    sLinkedList.addFirst(2);
    sLinkedList.addFirst(3);
    sLinkedList.addFirst(4);
    sLinkedList.addFirst(5);

    System.out.println(sLinkedList);
    System.out.println("getNode: " + sLinkedList.getNode(0));

  }
}