package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"a", "b", "c", "d"};
    List<String> list = Arrays.asList(animals);

    List<Integer> listl = new ArrayList<>();
    listl.add(10);
    listl.add(0, 20);
    System.out.println(listl);
    System.out.println(listl.remove(1) + "이 삭제되었습니다.");
  }
}
