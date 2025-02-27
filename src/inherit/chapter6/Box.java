package inherit.chapter6;

public class Box {
  // 컴파일러가 기본 생성자를 만들어줌
  // public box() {}
}

class ColoredBox extends Box {
  // 객체 생성 시 부모 생성자도 만들어줌
   public ColoredBox(String color) {
     this.color = color;
   }

}
