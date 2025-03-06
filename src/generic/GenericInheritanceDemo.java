package generic;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list1 = new ArrayList<>();
    list1.add(new Beverage()); // 인덱스 0
    list1.add(new Beer());    // 인덱스 1
    list1.add(new Boricha()); // 인덱스 2

    beverageTest(list1);

    Beverage b1 = list1.get(0);
    Beverage b2 = list1.get(1);
    Beverage b3 = list1.get(2);

    Beer b4 = (Beer) list1.get(1);
    Boricha b5 = (Boricha) list1.get(2);

    ArrayList<Beer> list2 = new ArrayList<>();
//    list2.add(new Boricha());   // 강한 타입 체크 (컴파일 에러 / 타입 안정성)
//    list2.add(new Beverage());  // 강한 타입 체크 (컴파일 에러 / 타입 안정성)
    list2.add(new Beer());
    beverageTest(list2); // 강한 타입 체크 (제네릭은 타입 안정성을 보장하기 위해 상속 관계라도 제네릭이 적용되면 서로 다른 타입으로 취급합니다)

  }

  static void beverageTest(ArrayList<Beverage> list) {

  }

}
