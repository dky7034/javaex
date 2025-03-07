package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");
//    list.add("k3"); // List.of로 만들어진 객체는 Array를 기반으로 만들어졌으므로 크기가 고정되어있어 요소를 추가할 수 없습니다.
    List<String> list2 = new ArrayList<>(list);

  }
}
