public class PrinterDemo {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");
  }
}

class Printer {
  // 생성자
  // 메서드 (void, println, value(int, boolean, double, String))
  // 메서드 오버로딩 -> 메서드 이름은 동일하나 나머지 메서드 시그니처(매개변수 타입, 개수, 순서)를 다르게 정의하여 메서드를 여러 개 만드는 것
  static void println(int num) {
    System.out.println(num);
  }

  static void println(boolean b) {
    System.out.println(b);
  }

  static void println(double d) {
    System.out.println(d);
  }

  static void println(String str) {
    System.out.println(str);
  }

}
