package test;

import java.util.stream.Stream;

public class Test2 {
  public static void main(String[] args) {
    Stream.of("a1", "a2", "a3")
        .map(s -> s.substring(1)) // 모든 요소를 인덱스 1번부터 출력 - 1, 2, 3
        .mapToInt(Integer::parseInt) // Integer 로 형변환
        .max() // 최댓값 거르기
        .ifPresent(System.out::println); // 3
  }
}
