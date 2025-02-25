package example;

import java.util.ArrayList;
import java.util.Scanner;

public class ExampleChapter5_9 {
  public static void main(String[] args) {
    // 학생들의 점수를 분석하는 프로그램을 만들려고 합니다.
    // 키보드로부터 학생 수와 학생들의 점수를 입력받고,
    // while 문과 nextLine() 메서드를 이용해서
    // 총점 및 평균 점수를 출력하는 코드를 작성하세요
    // ---------------------------------------------------
    // 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
    // ---------------------------------------------------

    // 사용자로부터 입력받기 위해 Scanner 객체 생성
    Scanner in = new Scanner(System.in);
    String menuItem = "";
    // 텍스트블록 사용
    String menu = """
        ---------------------------------------------------
        1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료
        ---------------------------------------------------
        """;
    // 학생 수를 저장하는 변수
    int numOfStudent = 0;
    // 학생 점수를 저장하는 변수
    ArrayList<Integer> scores = new ArrayList<>();
    // 총점을 저장하는 변수
    int total = 0;
    // 평균을 저장하는 변수
    float avg = 0.0f;
    // while 반복문 안에서 입력받기
    while (true) {
      System.out.print(menu);
      System.out.print("선택> "); // 5
      menuItem = in.nextLine();
      if (menuItem.trim().equals("5")) {
        System.out.println("프로그램을 종료합니다.");
        break; // 프로그램 종료
      }
      switch (menuItem) {
        case "1" -> {
          System.out.print("학생 수를 입력해 주세요> ");
          numOfStudent = Integer.parseInt(in.nextLine().trim());
          System.out.println("학생 수: " + numOfStudent);
        }
        case "2" -> {
          int numOfInput = numOfStudent;
          while (true) {
            // 학생 수가 0이 되면 반복문 종료 (입력 횟수 0)
            if (numOfInput == 0) {
              break;
            }
            int score = 0;
            System.out.printf("점수를 입력해 주세요> ");
            score = Integer.parseInt(in.nextLine().trim());
            // 잘못된 점수를 입력받았을 경우 다시 입력받기 (점수가 0점 미만일 경우)
            if (score < 0) {
              System.out.println("잘못된 점수를 입력하셨습니다. 다시 입력해 주세요.");
              continue;
            }
            // 조건을 통과한 점수만 리스트에 추가
            scores.add(score);
            // 입력받은 학생 수 차감 (입력 횟수)
            numOfInput--;
          }
        }
        case "3" -> {
          System.out.print("점수를 출력합니다: ");
          System.out.println(scores);
        }
        // 분석: 총점 및 평균 점수를 출력
        case "4" -> {
          for (Integer score : scores) {
            total += score;
          }
          avg = total / (float)numOfStudent;
          System.out.println("total = " + total);
          System.out.println("avg = " + avg);
        }
        default -> {
          System.out.println("올바르지 않은 선택입니다. 다시 선택해 주세요.");
        }
      } // end of switch
    } // end of while

  } // end of main method

} // end of class
