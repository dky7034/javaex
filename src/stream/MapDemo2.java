package stream;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo2 {
  public static void main(String[] args) {
    // 문제 1.
    // 국가정보를 리스트로 얻어오기
    List<Nation> nations = Nation.nations;
    // 리스트를 스트림으로 변환하기
    Stream<Nation> s1 = nations.stream();
    // 국가의 이름만을 스트림으로 map 시키기
    // 4개의 국가의 이름만 출력하기
    s1.map(n -> n.getName())
        .limit(4)
        .forEach(Util::printWithParenthesis);

    // 줄바꿈
    System.out.println();

    // 문제 2.
    // 국가정보를 리스트로 얻어오기
    // 리스트를 스트림으로 변환하기
    // GDP 순위만을 number 스트림으로 map 시키기
    // 전 국가의 GDP 순위를 출력하기
    nations1.stream()
        .mapToInt(n -> n.getGdpRank())
        .forEach(Util::printWithParenthesis);
  }
}
