package test;

public class Concrete extends Abstract {
  // 필드
  int a;
  int b;
  // 생성자
  public Concrete(int a, int b) {
    this.a = a;
    this.b = b;
  }
  // 메서드
  // 부모 메서드 오버라이드
  @Override
  public void show() {
    System.out.println("Concrete 가 오버라이딩한 메서드입니다.");
    System.out.println("i = " + i);
  }
}
