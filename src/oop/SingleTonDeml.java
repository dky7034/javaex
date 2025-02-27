package oop;

public class SingleTonDeml {
  public static void main(String[] args) {
    SingleTon s1 = SingleTon.getInstance();
    SingleTon s2 = SingleTon.getInstance();
    // 싱글톤 객체 메서드 호출
    s1.method();
    s2.method();

    // true면 싱글톤 객체, false면 일반 객체
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }

}
