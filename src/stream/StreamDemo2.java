package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {
  public static void main(String[] args) {
    int[] iarr = new int[]{1, 2, 3, 4, 5}; // 배열, 공간적 집합체
    IntStream stream = Arrays.stream(iarr); // 스트림이라는 시간적 집합체

    double[] darr = {1.0, 2.0, 3.0, 4.0};
    DoubleStream stream3 = Arrays.stream(darr);

    long[] larr = {1L, 2L, 3L, 4L};

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 리스트, 공간적 집합체
    Stream<Integer> stream1 = list.stream(); // 스트림이라는 시간적 집합체

    String[] sarr = {"a", "b", "c", "d"};
    Stream<String> stream2 = Arrays.stream(sarr);

  }
}
