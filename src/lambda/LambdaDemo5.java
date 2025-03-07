package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo5 {
  public static void main(String[] args) {
    String[] sArr = {
        "로마에 가면 로마법을 따르라",
        "시간은 금이다",
        "펜은 칼보다 강하다"
    };

    Arrays.sort(sArr);
    System.out.println(Arrays.toString(sArr));

    Comparator<String> c = str -> 
  }
}
