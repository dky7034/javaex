package stream;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("abc", "b", "cd", "d", "e");
    Stream<Integer> is = s1.map(s -> s.length());
  }
}
