package etc;

public class MemoryStructureDemo {
  public static void main(String[] args) {
    Data data = new Data();
    System.out.println("data.x = " + data.x); // 0
    MethodClass mc = new MethodClass();
    System.out.println(mc.add(1, 2)); // 3
    change(data);
    System.out.println("after change : data.x = " + data.x); // 1000
  }

  static void change(Data data) {
    data.x = 1000;
  }
}

class Data {
  // 기본 생성자
  // 필드
  int x; // 힙에 저장되는 필드 (초기화 값: 0)
}

class MethodClass {
  // 기본 생성자
  // add() 메서드 -> Method Area에 저장됨 -> 나중에 힙 객체가 생성되면 Method Area에서 참조해서 사용함
  int add(int a, int b) {
    return a + b;
  }
}