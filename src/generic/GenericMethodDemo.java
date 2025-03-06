package generic;

public class GenericMethodDemo {
  static class Utils {
    // 제너릭 메서드 - <T> 반환타입 메서드명() {}
    public static <T> void method(T[] a) {
      for (T t : a) {
      }
    }
  }


  public static void main(String[] args) {

  }
}
