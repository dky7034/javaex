package default_package;

public class IntegerDemo {
  public static void main(String[] args) {
    int a = 0; // a 기초타입

    Integer b = 10; // b 참조타입, 자동 박싱
    Integer c = 10; // c 참조타입,
    System.out.println(b.equals(10));
    System.out.println(b.equals(c));
    System.out.println(b == c);

    int bi = b; // 자동 언박싱
    System.out.println(bi);
    System.out.println(bi == c);
  }
}
