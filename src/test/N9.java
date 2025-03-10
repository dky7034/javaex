package test;

import java.util.HashMap;
import java.util.Map;

public class N9 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0; // 최고 점수를 저장하는 변수
    int totalScore = 0; // 점수 합계를 저장하는 변수

    map.entrySet();

    // 여기에 코드를 작성하세요.
    for (Integer i : map.values()) {
      totalScore += i;
      if (maxScore < i) {
        maxScore = i;
      }
    }

    System.out.println("maxScore = " + maxScore);
    System.out.println("totalScore = " + totalScore);
    System.out.println("name = " + name);

  }
}