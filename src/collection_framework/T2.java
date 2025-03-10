package collection_framework;

import java.util.*;

public class T2 {
  public static void main(String[] args) {
    Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
    for (String value : map.values()) {
      Collections.replaceAll(map, value, value.toUpperCase());
      System.out.println(value);
    }
//    Collections.replaceAll();

  }
}
