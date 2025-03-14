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

    Stream<Nation> nations1 = Nation.nations.stream();
    Optional<Nation> first = nations1.filter(nation -> nation.getGdpRank() == 10).findFirst();
    first.ifPresentOrElse(nation -> System.out.println(nation.getName()),
        () -> System.out.println("해당하는 국가를 찾을 수 없습니다."));

    Optional<Nation> any = Nation.nations.stream()
        .filter(nation -> nation.getGdpRank() < 10).findAny();
    any.ifPresentOrElse(nation -> System.out.println("조건을 만족하는 국가는 " + nation.getName()),
        () -> System.out.println("조건을 만족하는 국가를 찾을 수 없습니다."));

  }
}
