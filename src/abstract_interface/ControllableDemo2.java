package abstract_interface;

public class ControllableDemo2 {
  public static void main(String[] args) {
    test(new TV());
    test(new Computer());
    test(new NoteBook());
  }

  // 매개변수를 인터페이스로 주고, (tv, computer, notebook 객체를 이용)
  // 형변환과 다형성을 테스트해 보세요.
  public static void test(Controllable c) {
    c.turnOn();
    c.turnOff();
    c.repair();
  }
}
