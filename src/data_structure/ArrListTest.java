package data_structure;

import java.util.ArrayList;
import java.util.List;

public class ArrListTest {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5};
    


    List<Integer> arrList = new ArrayList<>();
    arrList.add(1);
    arrList.add(2);
    arrList.add(3);
    arrList.add(4);
    arrList.add(5);
    arrList.remove(3);
    System.out.println(arrList);
  }


}
