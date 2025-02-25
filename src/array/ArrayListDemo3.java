package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    // 1. 시험점수를 사용자로부터 입력받는다 (단, 과목의 수는 정해져 있지 않음).
    // 2. -1을 입력받을 때까지 과목의 점수를 입력받는다.
    // 3. 입력받은 점수를 동적배열에 저장한다.
    // 4. while 문을 사용한다.
    // 5. 입력받은 점수가 저장되어 있는 배열을 전부 읽어서 합계와 평균을 구한다.
    // 6. 입력받은 점수, 합계와 평균을 출력한다.

    // 사용자로부터 입력받기 위해 Scanner 객체 생성
    Scanner in = new Scanner(System.in);

    // 동적 배열 ArrayList 선언 및 생성
    ArrayList<Integer> scores = new ArrayList<>();

    // while 문 내에서 점수를 입력받음 (-1 입력받으면 반복문 종료)
    int score = 0;
    while (true) {
      System.out.print("점수를 입력해 주세요: ");
      score = in.nextInt();
      if (score == -1) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (score != -1 && score < 0) {
        System.out.println("잘못된 점수를 입력했습니다. 다시 입력해 주세요.");
        continue;
      }
      scores.add(score);
    }

    // 배열을 전부 읽어서 합계와 평균 구하기
    int sum = 0;
    float avg = 0.0f;
    for (int i = 0; i < scores.size(); i++) {
      sum += scores.get(i);
    }
    avg = sum / (float) scores.size();
    System.out.println("scores = " + scores);
    System.out.println("sum = " + sum);
    System.out.println("avg = " + avg);
  }
}
