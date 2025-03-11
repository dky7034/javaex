package stream;

public class LoopDemo {
  public static void main(String[] args) {
    Nation.nations.stream().
        peek(nation -> System.out.println(nation.getName()));
  }
}
