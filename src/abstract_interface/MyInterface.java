package abstract_interface;

public interface MyInterface {
  // 상수 필드
  public static final int max = 10;
  // 추상메서드
  public abstract void sayHello();

}

// 인터페이스는 인터페이스끼리 상속
interface YourInterface extends MyInterface {
  int max = 100;

  void sayHello2();
}
