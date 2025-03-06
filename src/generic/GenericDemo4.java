package generic;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList();
    arrayList.add(10);
    arrayList.add("str");
    arrayList.add('c');

    int i = (Integer) arrayList.get(1);
  }
}
