package array;

import java.util.Arrays;

public class MaxFindDemo {
  public static void main(String[] args) {
    // 배열 요소 중 최솟값, 최댓값 찾기 -> O(N)
    int[] values = {1, 5, 2, 7, 3};

    // 지역변수 min, max 생성
    int min = values[0];
    int max = values[0];

    // 최솟값 & 최댓값 찾기
    for (int value : values) {
      if (min > value) {
        min = value;
      } else if (max < value) {
        max = value;
      }
    }

    // 최솟값 & 최댓값 출력
    System.out.println("min = " + min);
    System.out.println("max = " + max);

    System.out.println("정렬 전: " + Arrays.toString(values));
    Arrays.sort(values);
    System.out.println("정렬 후: " + Arrays.toString(values));
    System.out.println("min = " + values[0]);
    System.out.println("max = " + values[values.length - 1]);

  }
}
