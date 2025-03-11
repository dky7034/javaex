package stream;

import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
    s1.filter(s -> s.startsWith("c")).forEach(s -> Util.print(s));

    Stream<String> s2 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
    s2.filter(s -> s.startsWith("c"))
  }
}
