package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Map<String, Integer> map = new HashMap<>();

    map.put("김열공", 80);
    map.put("최고봉", 80);
    map.put("우등생", 80);
    map.put("나자바", 80);

    System.out.print("이름을 입력하세요 : ");
    String name = in.nextLine();

    Integer score = map.get(name);
    if (score == null) {
      System.out.println(name + "의 점수를 찾을 수 없습니다.");
    } else {
      System.out.println(name + "의 점수는" + score + "저입니다.");
    }

  }
}
