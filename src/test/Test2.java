package test;

public class Test2 {
  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3, 4));  // 9
    int arr[] = {2, 3};
    System.out.println(sum(1, arr));  // 5
    System.out.println(sum(1, 2, 3, 4, 5)); // 14
  }

  // sum 메서드 생성
  // 첫 번째 매개변수를 제외한 나머지 가변개수인수로 들어온 값들만 합계를 구하는 문제
  public static int sum(int i, int... values) {
    int sum = 0;
    for (int value : values) {
      sum += value;

    }
    return 0;
  }
}
