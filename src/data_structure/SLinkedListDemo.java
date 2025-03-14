package data_structure;

import java.util.LinkedList;

public class SLinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<>();
    System.out.println(linkedList.size());

    SLinkedList<Integer> sLinkedList = new SLinkedList<>();
    System.out.println(sLinkedList.size());
  }
}