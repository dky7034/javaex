package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class T2 {
  public static void main(String[] args) {
    // Map.of는 불변 객체를 생성합니다.
    Map<String, String> map = new HashMap<>(Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion"));

    map.replaceAll((key, value) -> value.toUpperCase());

    System.out.println(map);
  }

}