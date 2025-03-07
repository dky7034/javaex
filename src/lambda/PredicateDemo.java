package lambda;

import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
//    Predicate<String> isEmpty = new Predicate<String>() {
//      @Override
//      public boolean test(String s) {
//        return s.length() == 0;
//      }
//    };
//    String s = "";
//    if (s != null && isEmpty.test(s)) {
//      System.out.println("빈 문자열입니다.");
//    }

    // 함수형 인터페이스 - 람다식 활용
    String str = "";
    Predicate<String> isEmpty2 = s -> s.length() == 0;

  }
}

