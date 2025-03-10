package test;

public class T0 extends T0class {
  public static void main(String[] args) {
    
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