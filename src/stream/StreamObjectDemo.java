package stream;

import java.util.List;

public class StreamObjectDemo {
  public static void main(String[] args) {
    List<Nation> nations = Nation.nations;
    nations.stream();
    System.out.println(Nation.nations);
  }
}
