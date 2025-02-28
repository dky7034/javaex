package etc;

public class IncrementDemo2 {
  public static void main(String[] args) {
    RefValue ref = new RefValue();
    ref.x = 10;
    System.out.println("ref.x = " + ref.x);
    System.out.println("호출 전 ref.x = " + ref.x);
    changePrimitive(ref.x); // call by value (readOnly)
    System.out.println("호출 후 ref.x = " + ref.x);

  }

  static void changePrimitive(int n) {
    System.out.println("메서드 실행 전 n = " + n);
    n = 1000;
    System.out.println("메서드 실행 후 n = " + n);
  }
  static void changePrimitive(RefValue ref) {
    ref.x = 1000;
  }

}

class RefValue {
  int x;
}