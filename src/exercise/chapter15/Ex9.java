package exercise.chapter15;

import java.util.HashMap;
import java.util.Map;

public class Ex9 {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("blue", 96);
    map.put("hong", 86);
    map.put("white", 92);

    String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
    int maxScore = 0; // 최고 점수를 저장하는 변수
    int totalScore = 0; // 점수 합계를 저장하는 변수

    // 에러 발생
    // entrySet() 은 Set 타입 컬렉션을 반환하는데, 이를 Map.Entry<> 타입으로 변환하는
    // 타입 캐스팅이 불가능하기 때문에 에러가 발생합니다.
    System.out.println("--- 출력 Test ---");
    Map.Entry<String, Integer> entries = (Map.Entry<String, Integer>)map.entrySet();
    String key = entries.getKey();
    Integer value = entries.getValue();
    System.out.println("key = " + key);
    System.out.println("value = " + value);
    

    // 여기에 코드를 작성하세요.
    // entrySet() 사용
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
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