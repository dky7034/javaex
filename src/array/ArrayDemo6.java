package array;

public class ArrayDemo6 {
  public static void main(String[] args) {
    // 원을 원소로 가지는 배열을 선언한 후 5개의 원을 초기화 하세요.
    Circle[] circles = new Circle[5];
    for (int i = 0; i < 5; i++) {
      circles[i] = new Circle();
    }


    // 원의 반지름은 1 ~ 5 까지입니다.
    // 모든 원의 반지름과 넓이를 출력
  }
}
