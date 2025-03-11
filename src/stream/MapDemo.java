package stream;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("abc", "b", "cd", "d", "e");
    Stream<Integer> s2 = s1.map(s -> s.length());
    // 길이를 구해서 숫자로 변환
    s2.forEach(Util::print);
    // 중간을 잘라내서 문자열로 변환 (앞자리 하나만 substring 을 이용해서 잘라내기)

  }
}
