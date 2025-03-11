package stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {
  public static void main(String[] args) {
    String s = "hello java";
    String s2 = "hi, my name is";
    String[] s1 = s.split("");
    String[] s3 = s2.split("");
    System.out.println(s1.length);
    System.out.println(s3.length);

    Arrays.stream(s1);
    System.out.println("s1.length = " + s1.length);
    System.out.println("s2.length() = " + s2.length());
    
    List.of("안녕, 자바!", "잘 가", "C++!");
    

  }
}
