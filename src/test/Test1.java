package test;

public class Test1 {
  public static void main(String[] args) {
    countChar("character", c);
  }

  // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드
  static int countChar(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) {
        count++;
      }
    }
    return count;
  }
}
