package abstract_interface;

public class ControllableDemo2 {
  public static void main(String[] args) {
    test();
  }

  // 매개변수를 인터페이스로 주고, (tv, computer, notebook 객체를 이용)
  // 형변환과 다형성을 테스트해 보세요.
  public static void test(Controllable controllable) {
    Controllable[] controllables = new Controllable[]{new TV(), new Computer(), new NoteBook()};
    for (Controllable controllable1 : controllables) {

    }

  }
}
