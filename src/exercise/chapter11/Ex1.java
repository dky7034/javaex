package exercise.chapter11;

import java.util.LinkedList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
    // 부모 참조 타입 변수로 객체를 생성해야 나중에 유지보수에 유리함
    List<String> animals = new LinkedList<>();
//        new ArrayList<>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("다람쥐");
    animals.add("라마");

    for (String s : animals) {
      if (s.length() == 2) {
        System.out.println(s);
      }
    }

  }
}