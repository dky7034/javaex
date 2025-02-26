package array;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1, 2, 3, 4, 5, 6);
    printSum(1, 2, 3, 4, 5);
    printSum(1, 2, 3, 5);
    printSum(10, 20, 30);
  }

  // 메서드 오버로딩
  // 가변 개수 인수 사용
  // ... -> 가변 개수 데이터 타입을 나타냄
  // 가변 개수 인수를 가진 메서드를 호출하면 내부적으로 배열을 생성하여 처리
  private static void printSum(int... v) {
    int sum = 0;
    for (int i : v) {
      sum += i;
    }
    System.out.println("sum = " + sum);
  }
//  public static void printSum(int a, int b, int c, int d, int e, int f) {}
//  public static void printSum(int a, int b, int c, int d, int e) {}
//  public static void printSum(int a, int b, int c, int d) {}
//  public static void printSum(int a, int b, int c) {}
}
