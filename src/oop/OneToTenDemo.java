package oop;

public class OneToTenDemo {
  // 생성자
  public OneToTenDemo() {}

  // 멤버
  // 변수 (정적 변수)
  static int sumOneToTen;
  // static 블록
  static {
    int sum = 0;
  }
  // 메서드 (정적 메서드)
  public static void main(String args[]) {
    System.out.println(sumOneToTen);
  }

}
