package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class LoopDemo {
  public static void main(String[] args) {
    Stream<Nation> peek = Nation.nations.stream()
        .peek(Util::printWithParenthesis);

    peek.max(Comparator.comparing(nation -> nation.getPopulation()));

  }
}
