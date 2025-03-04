package abstract_interface;

public interface MyInterface {
  // 상수 필드
  public static final int max = 10;
  // 추상메서드
  public abstract void sayHello();

  public abstract void myNameIs();
}

class NewClass implements MyInterface {
  @Override
  public void sayHello() {

  }

  @Override
  public void myNameIs() {

  }
}