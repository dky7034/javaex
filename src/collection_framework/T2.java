package collection_framework;

import java.util.*;
import java.util.function.BiFunction;

public class T2 {
  public static void main(String[] args) {
    Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
    for (String value : map.values()) {
      map.replaceAll((s1, s2) -> s2.toUpperCase());
      BiFunction b = new BiFunction() {
        @Override
        public Object apply(Object o1, Object o2) {
          return null;
        }
      }
      System.out.println(value);
    }

  }
}
