package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
  public static void main(String[] args) {
    List<String> capitals = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
    Stream<String> stream = list.stream();
    stream.sorted().findFirst().ifPresentOrElse(s -> System.out.println(s), () -> System.out.println("찾는 값이 없습니다."));

  }
}
