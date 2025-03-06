package generic;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList();
    arrayList.add(10);
//    arrayList.add("str"); // 타입 안전성 보장
//    arrayList.add('c');

    int i = (Integer) arrayList.get(1);
  }
}
