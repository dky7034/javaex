package test;

public class Test1 {
  public static void main(String[] args) {
    int result = countChar("hello", 'l');
    System.out.println("result = " + result);
  }

  // 문자열 s에 포함된 문자 c의 개수를 반환하는 메서드
  static int countChar(String s, char c) {
    // 매개변수로 전달받은 문자열을 쪼개어 담기 위한 배열 생성
    char[] arr = new char[s.length()];
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      arr[i] = s.charAt(i);
      if (arr[i]) {
        count++;
      }
    }
    return count;
  }
}
