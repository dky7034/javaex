package test;

public abstract class Abstract {
  public int i;

  public Abstract(int i) {
    this.i = i;
  }

  public abstract void show();
}

class Concrete extends Abstract {
  // 필드
  int i;

  // 생성자
  public Concrete(int i, int i1) {
    super(i);
    this.i = i1;
  }

  // 메서드
  // 부모 메서드 오버라이드
  @Override
  public void show() {
    System.out.println("Concrete 가 오버라이딩한 메서드입니다.");
  }
}

