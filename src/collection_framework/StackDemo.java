package collection_framework;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("10");
    stack.push("20");
    stack.push("30");
    System.out.println(stack.peek());
    System.out.println(stack.pop());

  }
}
