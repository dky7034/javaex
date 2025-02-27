package test;

import java.util.ArrayList;

public class Test1 {
  public static void main(String[] args) {
    int result = countChar("hello", 'l'); // 2
    int result1 = countChar("hello", 'L'); // 0
    System.out.println("result = " + result);
    System.out.println("result1 = " + result1);
  }

  // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드
  static int countChar(String s, char c) {
    // 매개변수로 전달받은 문자열을 쪼개어 담기 위한 배열 생성
    char[] arr = new char[s.length()];
    // 매개변수로 전달받은 문자열을 쪼개어 담기 위한 ArrayList 생성
    ArrayList<Character> temp = new ArrayList<Character>();
    int count = 0;
//    for (int i = 0; i < s.length(); i++) {
//      arr[i] = s.charAt(i);
//      if (arr[i] == c) {
//        count++;
//      }
//    }
    for (int i = 0; i < s.length(); i++) {
      temp.add(i, s.charAt(i));
      if (temp.get(i) == c) {
        count++;
      }
    }
    return count;
  }

  static int countChar(String s, char c) {
    
  }
}
