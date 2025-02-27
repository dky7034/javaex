package inherit.chapter6;

public class Box {
  public Box(String s) {
  }

//  public Box() {
//  }
}

class ColoredBox extends Box {
  public ColoredBox(String color) {
    this.color = color;
  }

  // 필드
  String color;

}
