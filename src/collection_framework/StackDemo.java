package collection_framework;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
//    stack.push("10");
//    stack.push("20");
//    stack.push("30");

    if (!stack.isEmpty()) {
      System.out.println(stack.peek());
    } else {
      System.out.println("스택에 자료가 없습니다.");
    }

    System.out.println(stack.peek());


  } // end of main method
} // end of class
