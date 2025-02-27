package inherit.chapter6;

public class Box {
  public Box(String s) {}
   public Box() {}
}

class ColoredBox extends Box {
  // 객체 생성 시 부모 생성자도 만들어줌
  public ColoredBox(String color) {
    super();
    this.color = color;
  }

  // 필드
  String color;

}
