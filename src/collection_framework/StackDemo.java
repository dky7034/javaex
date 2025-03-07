package collection_framework;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
//    stack.push("10");
//    stack.push("20");
//    stack.push("30");

    if (!stack.isEmpty()) {
      System.out.println(stack.peek()); // 30
    }
    System.out.println(stack.pop()); // 30 삭제
    System.out.println(stack.peek()); // 20
    System.out.println(stack.pop()); // 20 삭제
    System.out.println(stack.peek()); // 10
    System.out.println(stack.pop()); // 10 삭제
    System.out.println(stack.pop()); // EmptyStackException (Unchecked Exception)
  }
}
