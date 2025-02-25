package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    // 1. 다섯 과목의 점수를 사용자로부터 입력받는다.
    // 2. 입력받은 점수를 배열에 저장한다.
    // 3. for 문을 사용한다.
    // 4. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    // 5. 입력받은 점수, 합계와 평균을 출력한다.

    // 사용자로터 입력받기 위해 Scanner 객체 생성
    Scanner in = new Scanner(System.in);
    // 배열 선언 (크기 5)
    int[] scores = new int[5];
    // 변수 선언: 점수 합계
    int total = 0;
    // 변수 선언: 점수 평균
    float avg;

    // 사용자로부터 입력받기
    for (int i = 0; i < scores.length; i++) {
      System.out.printf("%d번째 과목의 점수를 입력해 주세요 (0 ~ 100): ", i+1);
      scores[i] = in.nextInt();
      total += scores[i];
      if (scores[i] < 0 || scores[i] > 100) {
        System.out.println("잘못된 점수를 입력하셨습니다. 프로그램을 종료합니다.");
      }
    }

    // 입력받은 점수의 합계, 평균 구하기
//    for (int i = 0; i < scores.length; i++) {
//      total += scores[i];
//    }
    avg = total / (float)scores.length;

    // 입력받은 점수, 합계, 평균 출력하기
    System.out.println("scores = " + Arrays.toString(scores));
    System.out.println("total = " + total);
    System.out.println("avg = " + avg);
  }
}
