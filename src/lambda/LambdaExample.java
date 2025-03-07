package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

    Comparator c = new Comparator() {
      @Override
      public int compare(String o1, String o2) {
        return 0;
      }
    };
    Collections.sort(list);
  }
}

interface Comparator<T> {
  int compare(T o1, T o2);
}
