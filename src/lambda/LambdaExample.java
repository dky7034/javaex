package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
    Collections.sort(list);
    Collections.
  }
}

interface Comparator<T> {
  int compare(T o1, T o2);
}
