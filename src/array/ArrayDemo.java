package array;

import java.util.Scanner;

public class ArrayDemo {
  public static void main(String[] args) {
    // 5 과목의 점수를 저장하고 총점과 평균 구하기
    int score1 = 100, score2 = 90, score3 = 80, score4 = 90, score5 = 78;
    int total = score1 + score2 + score3 + score4 + score5;
    double avg = total / (double) 5;

    System.out.println("total = " + total);
    System.out.println("avg = " + avg);

    int[] scores = {100, 90, 80, 90, 78};
    total = 0;
    for (int i = 0; i < scores.length; i++) {
      total += scores[i];
    }
    System.out.println("total = " + total);

    int[] score = new int[5];
    for (int i = 0; i < score.length; i++) {
      Scanner in = new Scanner(System.in);
      score[i] = in.nextInt();
    }

    for (int sum : score) {
      System.out.println(sum);
    }
  }
}
