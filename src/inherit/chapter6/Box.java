package inherit.chapter6;

public class Box {
  public Box(String s) {
  }

  public Box() {
  }
}

class ColoredBox extends Box {
  super("부모 생성자");
  // 객체 생성 시 부모 생성자를 호출함
  public ColoredBox(String color) {
    this.color = color;
  }

  // 필드
  String color;

}
