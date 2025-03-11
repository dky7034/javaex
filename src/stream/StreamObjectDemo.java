package stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamObjectDemo {
  public static void main(String[] args) {
    List<Nation> nations = Nation.nations;
    Stream<Nation> stream = nations.stream();
    System.out.println(Nation.nations);
  }
}
