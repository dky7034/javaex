package test;

import java.util.ArrayList;

public class Test1 {
  public static void main(String[] args) {
    // 문자열 ArrayList 생성
    ArrayList<String> temp = new ArrayList<>();
    int result = countChar("hello", 'l');
    System.out.println("result = " + result);
  }

  // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드
  static int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      
      if (s.trim().charAt(i) == c) {
        count++;
      }
    }
    return count;
  }
}
