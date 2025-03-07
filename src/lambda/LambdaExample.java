package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExample {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");

    Comparator<String> c = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2);
        return o2.compareTo(o1);
      }
    };
    Collections.sort(list);
  }
}

interface Comparator<T> {
  int compare(T o1, T o2);
}
