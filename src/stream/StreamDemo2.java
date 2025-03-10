package stream;

import java.util.stream.Stream;

public class StreamDemo2 {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5}; // 배열, 공간적 집합체
    Stream.of(arr);
  }
}
