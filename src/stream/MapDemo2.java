package stream;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo2 {
  public static void main(String[] args) {
    // 문제 1.
    // 국가정보를 리스트로 얻어오기
    Stream<List<Nation>> nations = Nation.nations;

    // 리스트를 스트림으로 변환하기
    // 국가의 이름만을 스트림으로 map 시키기
    // 4개의 국가의 이름만 출력하기

    // 문제 2.
    // 국가정보를 리스트로 얻어오기
    // 리스트를 스트림으로 변환하기
  }
}
