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
//        return o1.compareTo(o2); // o1 > o2: 양수, o1 < o2: 음수, o1 == o2: 0
        return o2.compareTo(o1); // o1 > o2: 음수, o1 < o2: 양수, o1 == o2: 0
      }
    };
    Collections.sort(list);
  }
}

interface Comparator<T> {
  int compare(T o1, T o2);
}
