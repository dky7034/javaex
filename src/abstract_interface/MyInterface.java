package abstract_interface;

public interface MyInterface {
  // 상수 필드
  public static final int max = 10;
  // 추상메서드
  public abstract void sayHello();

}

// 인터페이스는 인터페이스끼리 상속
interface YourInterface extends MyInterface {
  int min = 0;
  void sayHello2();
}

// 클래스는 인터페이스를 구현
class MyClass implements YourInterface {
  @Override
  public void sayHello2() {

  }

  @Override
  public void sayHello() {

  }
}
