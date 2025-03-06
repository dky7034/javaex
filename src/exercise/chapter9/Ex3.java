package exercise.chapter9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex3 {
  public static void main(String[] args) {
    // 숫자(정수)를 담을 수 있는 ArrayList 선언
    ArrayList<Integer> ali = new ArrayList<>();
    ali.add(10);
    System.out.println(ali.get(0));

    // 문자열을 담을 수 있는 ArrayList 선언
    ArrayList<String> als = new ArrayList<>();
    als.add("str");
    System.out.println(als.get(0).length());

    // 숫자(정수)를 담을 수 있는 Stack 선언
    Stack<Integer> sti = new Stack<>();
    sti.add(11);
    System.out.println(sti.pop());

    // 문자열을 담을 수 있는 Stack 선언
    Stack<String> sts = new Stack<>();
    sts.add("str");
    System.out.println(sts.pop().toUpperCase());

    // 숫자(정수)를 담을 수 있는 Queue 선언
    Queue<Integer> qi = new LinkedList<>();
    qi.add(12);
    System.out.println(qi.poll());

    // 문자열을 담을 수 있는 Stack 선언
    Queue<String> qs = new LinkedList<>();
    qs.add("str");
    System.out.println(qs.poll().toUpperCase());
  }
}
