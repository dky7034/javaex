package stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopDemo {
  public static void main(String[] args) {
    Stream<Nation> peek = Nation.nations.stream()
        .peek(Util::printWithParenthesis);

    Optional<Nation> max = peek.max(Comparator.comparing(nation -> nation.getPopulation()));
    System.out.println();
    System.out.println("max = " + max.get());

    OptionalInt min = IntStream.of(5, 1, 2, 3).min();
    System.out.println(min.getAsInt());

    int sum = IntStream.of(5, 1, 2, 3).sum();
    double avg = IntStream.of(5, 1, 2, 3).average();

  }
}
