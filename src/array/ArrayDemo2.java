package array;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    // 초기화 방법 1
    int[] scores1 = {90, 80, 95, 85, 70, 50, 60, 45, 85, 95, 100};
    // 초기화 방법 2
    int[] scores2 = new int[]{1, 2, 3, 4, 5};
    // 초기화 방법 3
    int[] scores3;
    scores3 = new int[]{1, 2, 3, 4, 5};
    // 초기화 방법 4
    int[] scores4 = new int[5];
    // error
//    int[] scores_error;
//    scores_error = {1, 2, 3, 4, 5};

    System.out.println("score1[last] = " + scores1[scores1.length - 1]); // 빅오 표기법 - 0(1)

    for (int i = 0; i < scores1.length; i++) {
      if (scores1[i] == 100) {
        System.out.printf("%d 번째에서 찾음 \n", i);
        break;
      } // 빅오 표기법 - 0(N), 최악의 경우
    }

    for (int i = 0; i < scores1.length; i++) {
      if (i == scores1.length - 1) {
        System.out.print(scores1[i]);
      } else {
        System.out.print(scores1[i] + ", ");
      }
    }

    System.out.println();

    System.out.println(Arrays.toString(scores1));

    char[] chars = {'a', 'b', 'c'};
    System.out.println("chars = " + chars);

    System.out.println(Arrays.toString(chars));

  } // end of main method
} // end of class
