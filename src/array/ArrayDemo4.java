package array;

import java.util.Arrays;

public class ArrayDemo4 {
  public static void main(String[] args) {
    String[] names = new String[3];
    System.out.println(Arrays.toString(names));
    names[0] = "kim";
    System.out.println(Arrays.toString(names));

    // 배열 안의 문자열 길이 출력하기
    for (int i = 0; i < names.length; i++) {
//      if (names[i] != null) {
//        System.out.println(names[i].length());
//      } else {
//        System.out.println(0);
//      }
      if (names[i] != null && names[i].length() > 0) {
        System.out.println(names[i].length());
      }
    }



  }
}
