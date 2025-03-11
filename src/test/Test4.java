package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("서울");
    list.add("워싱턴");
    list.add("베이징");
    list.add("파리");
    list.add("마드리드");
    list.add("런던");
    
    Stream.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")

  }
}
