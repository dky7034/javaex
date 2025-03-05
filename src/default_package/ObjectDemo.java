package default_package;

public class ObjectDemo {
  public static void main(String[] args) {
    Keyboard keyboard = new Keyboard("키보드");
    Keyboard keyboard1 = new Keyboard("키보드");
    Mouse mouse = new Mouse("마우스");
    Mouse mouse1 = new Mouse("마우스");

    System.out.println(keyboard);
    System.out.println(mouse);

    // Keyboard 클래스에서 equals() 메서드 오버라이딩
    System.out.println(keyboard.equals(keyboard1));
    // Mouse 클래스에서 equals() 메서드 오버라이딩
    System.out.println(mouse.equals(mouse1));
  }
}
