package abstract_interface;

// 인터페이스는 인터페이스끼리 상속
public interface YourInterface extends MyInterface {
  int min = 0;

  void sayHello2();
}

// 클래스는 인터페이스를 구현
// 클래스 - 완성된 설계도 → 추상 메서드를 반드시 구현해야 함
class MyClass implements YourInterface {
  int myClassInt = 1;
  int yourClassInt = 2;

  @Override
  public void sayHello() {

  }

  @Override
  public void myNameIs() {

  }

  @Override
  public void sayHello2() {

  }
}

class MyClass2 extends MyInterfaceDemo {
  @Override
  public void sayHello() {
    System.out.println("hello");
  }

  @Override
  public void sayHello2() {
    System.out.println("hello2");
  }
}
