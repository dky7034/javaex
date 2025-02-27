package inherit.chapter6;

public class Box {
  public Box(String s) {
  }

  public Box() {
  }
}

class ColoredBox extends Box {
  public ColoredBox(String color) {
    super("부모 생성자");
    this.color = color;
  }

  // 필드
  String color;

}
