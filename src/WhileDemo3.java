import java.util.Scanner;

public class WhileDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해 주세요: ");
    int score = in.nextInt();
    String grade = "";

    while (true) {
      // 입력값(score)이 0보다 작으면 탈출(break)
      if (score < 0) {
        break;
      }

      if (score >= 90 && score <= 100) {
        if (score >= 95) {
          grade = "A+";
        } else {
          grade = "A0 or A-";
        }
      } else if (score >= 80 && score < 90) {
        grade = "B";
      } else if (score >= 70 && score < 80) {
        grade = "C";
      } else if (score >= 60 && score < 70) {
        grade = "D";
      } else {
        grade = "F";
      }
      System.out.println("당신의 학점은 " + grade + "입니다.");
      if (grade.equals("F")) {
        System.out.printf("이런.. 당신의 학점은 %s입니다.\n", grade);
      }
      System.out.print("점수를 입력해 주세요: ");
      score = in.nextInt();
    } // end while

  } // end main method
} // end class
