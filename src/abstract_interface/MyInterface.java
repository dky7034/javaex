package abstract_interface;

public interface MyInterface {
  // 상수 필드
  public static final int max = 10;
  // 추상메서드
  public abstract void sayHello();

  default void myNameIs() {
    
  }
}

class NewClass implements MyInterface {
  @Override
  public void sayHello() {
    System.out.println("hello");
  }

  @Override
  public void myNameIs() {
    System.out.println("my name is newClass");
  }
}