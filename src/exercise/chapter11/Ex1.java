package exercise.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {
    List<String> al =
//        new ArrayList<>();
    al.add("갈매기");
    al.add("나비");
    al.add("다람쥐");
    al.add("라마");

    for (String s : al) {
      if (s.length() == 2) {
        System.out.println(s);
      }
    }



  }
}