package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class N9 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0; // 최고 점수를 저장하는 변수
    int totalScore = 0; // 점수 합계를 저장하는 변수
    
    // 여기에 코드를 작성하세요.
    //
    for (Map.Entry<String, Integer> entry : entries) {
      totalScore += entry.getValue();
      if (maxScore < entry.getValue()) {
        maxScore = entry.getValue();
        name = entry.getKey();
      }
    }

    System.out.println("maxScore = " + maxScore);
    System.out.println("totalScore = " + totalScore);
    System.out.println("name = " + name);

  }
}