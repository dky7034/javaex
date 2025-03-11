package stream;

import java.util.stream.Stream;

public class LoopDemo {
  public static void main(String[] args) {
    Stream<Nation> peek = Nation.nations.stream().
        peek(nation -> System.out.println(nation.getName()))
        .forEach(Util::printWithParenthesis);
  }
}
