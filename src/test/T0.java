package test;

public class T0 {
  public static void main(String[] args) {
    T0interface t0interface = new T0interface() {
      @Override
      public boolean isLongEnough(String str) {
        return false;
      }
    };
    System.out.println();

  }
}

@FunctionalInterface
interface T0interface {
  boolean isLongEnough(String str);
}