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
    Integer[] a = {1, 2, 3, 4, 5};
    Double[] d = {1.0, 2.0, 3.0, 4.0, 5.0};
    Character[] c = {'a', 'b', 'c', 'd', 'e', 'f'};

    Utils.method(a);
  }
}
