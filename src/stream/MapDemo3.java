package stream;

public class MapDemo3 {
  public static void main(String[] args) {
    String s = "hello java";
    String s2 = "hi, my name is";
    String[] split = s.split("");
    for (String string : split) {
      System.out.println("string = " + string);
    }
  }
}
