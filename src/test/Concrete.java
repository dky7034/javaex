package test;

public class Concrete extends Abstract {
  // 필드
  int i;
  public Concrete(int i, int i1) {
    super(i);
  }
  // 생성자

  // 메서드
  // 부모 메서드 오버라이드
  @Override
  public void show() {
    System.out.println("Concrete 가 오버라이딩한 메서드입니다.");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("i = " + i);
  }
}
