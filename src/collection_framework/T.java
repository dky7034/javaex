package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("김열공", 80);
    map.put("최고봉", 80);
    map.put("우등생", 80);
    map.put("나자바", 80);

    Scanner in = new Scanner(System.in);
    System.out.print("이름을 입력하세요 : ");
  }
}
