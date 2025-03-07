package lambda;

import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    Predicate<String> isEmpty = new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    };
  }
}

