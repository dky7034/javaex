package oop;

public class SingleTonDeml {
  public static void main(String[] args) {
    SingleTon s1 = SingleTon.getInstance();

    // 싱글톤 객체 메서드 호출
    s1.method();
  }

}
