package collection_framework;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("10");
    stack.push("20");
    stack.push("30");

//    if (!stack.isEmpty()) {
//      System.out.println(stack.peek());
//    } else {
//      System.out.println("스택에 자료가 없습니다.");
//    }

//    try {
//      System.out.println(stack.peek());
//    } catch (EmptyStackException e) {
//      System.out.println(e.getMessage());
//    } finally {
//      System.out.println("프로그램 종료");
//    }

    for (String s : stack) {
      System.out.println(s);
    }


  } // end of main method
} // end of class
