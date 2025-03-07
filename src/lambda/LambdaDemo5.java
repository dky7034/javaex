package lambda;

import java.util.Arrays;

public class LambdaDemo5 {
  public static void main(String[] args) {
    String[] sArr = {
        "로마에 가면 로마법을 따르라",
        "시간은 금이다",
        "펜은 칼보다 강하다"
    };

    Arrays.sort(sArr);
    System.out.println(Arrays.toString(sArr));

    Arrays.sort(sArr, (str1, str2) -> str1.length() - str2.length());
    System.out.println(Arrays.toString(sArr));

  }
}
