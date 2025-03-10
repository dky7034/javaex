package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo2 {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5}; // 배열, 공간적 집합체
    IntStream intStream = Arrays.stream(arr); // 스트림이라는 시간적 집합체

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 리스트, 공간적 집합체
    list.stream();

  }
}
