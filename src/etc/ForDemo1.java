public class ForDemo1 {
  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.print("구구단 단수를 지정하세요: ");
//    int dan = in.nextInt();
//    for (int i = 0; i < 9; i++) {
//      System.out.printf("%d x %d = %d\n", dan, i+1, (dan * (i+1)));
//    }

    // 중첩 for 문
    for (int i = 2; i < 10; i++) {
      System.out.printf("----- %d단 출력 -----\n", i);
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d x %d = %d\n", i, j, i*j);
      }
    }

  } // end of main method

} // end of class
