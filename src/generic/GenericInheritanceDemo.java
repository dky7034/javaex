package generic;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list1 = new ArrayList<>();
    list1.add(new Beverage()); // 인덱스 0
    list1.add(new Beer());    // 인덱스 1
    list1.add(new Boricha()); // 인덱스 2

    Beverage b1 = list1.get(0);
    Beverage b2 = list1.get(1);
    Beverage b3 = list1.get(2);

    Beer b4 = (Beer) list1.get(1);
    Boricha b5 = (Boricha) list1.get(2);

    ArrayList<Beer> list2 = new ArrayList<>();
//    list2.add(new Boricha());   // 강한 타입 체크 (컴파일 에러 / 타입 안정성)
//    list2.add(new Beverage());  // 강한 타입 체크 (컴파일 에러 / 타입 안정성)
    list2.add(new Beer());

    // ArrayList 사이에는 아무런 관계가 없음
    

  }
}
