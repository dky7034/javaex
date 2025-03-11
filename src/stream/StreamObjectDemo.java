package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamObjectDemo {
  public static void main(String[] args) {
    List<Nation> nations = Nation.nations;
    Stream<Nation> stream = nations.stream();
    stream.filter(n -> n.getPopulation() > 100)
        .limit(2)
        .forEach(Util::printWithParenthesis);

  }
}
