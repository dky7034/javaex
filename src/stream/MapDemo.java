package stream;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("abc", "b", "cd", "d", "e");
    // 길이를 구해서 숫자로 변환
    Stream<Integer> s2 = s1.map(s -> s.length());
    s2.forEach(Util::print);

    // 한 줄 띄우기
    System.out.println();

    // 중간을 잘라내서 문자열로 변환 (앞자리 하나만 substring 을 이용해서 잘라내기)
    Stream<String> s3 = Stream.of("abc", "b", "cd", "d", "e");
    s3.map(s -> s.substring(0)).forEach(Util::print);

  }
}
