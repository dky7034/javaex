package stream;

import java.util.Optional;
import java.util.stream.Stream;

public class MatchDemo {
  public static void main(String[] args) {
    boolean b1 = Stream.of("a1", "b1", "c2").anyMatch(x -> x.startsWith("c"));
    System.out.println("b1 = " + b1); // false

    System.out.println(Stream.of(2, 4, 6, 8, 10).allMatch(i -> i % 2 == 0)); // true

    System.out.println(Stream.of(2, 4, 6, 8, 10).noneMatch(i -> i % 2 == 0)); // false

    Stream<Nation> nations = Nation.nations.stream();
    System.out.println(nations.allMatch(nation -> nation.getPopulation() > 100)); // false

    Optional<Nation> first = nations.findFirst();
    first.ifPresentOrElse(nation -> System.out.println(nation.getName()),
        () -> System.out.println("해당하는 국가를 찾을 수 없습니다."));
  }
}
