package test;

public class T0 {
  public static void main(String[] args) {
    T0class t0class = new T0class();
    t0class.
    System.out.println();

  }
}

@FunctionalInterface
interface T0interface {
  boolean isLongEnough(String str);
}

class T0class implements T0interface {
  @Override
  public boolean isLongEnough(String str) {
    return str.length() >= 5;
  }

}