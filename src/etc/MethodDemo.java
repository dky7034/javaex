public class MethodDemo {
  public static void main(String[] args) {
    // 메서드 호출 - sum();
    int result = sum(1, 10);
    System.out.println("1부터 10까지의 합은 " + result);

    result = sum(10, 100);
    System.out.println("10부터 100까지의 합은 " + result);

//    int sum = 0;
//    for (int i = 1; i <= 10; i++) {
//      sum += i;
//    }
//    System.out.println("1부터 10까지의 합: " + sum);
//
//    sum = 0;
//    for (int i = 10; i <= 100; i++) {
//      sum += i;
//    }
//    System.out.println("10부터 100까지의 합: " + sum);
//
//    sum = 0;
//    for (int i = 100; i <= 1000; i++) {
//      sum += i;
//    }
//    System.out.println("100부터 1000까지의 합: " + sum);

  } // end main method

  // 메서드 생성
  private static int sum(int startNum, int endNum) {
    int sum = 0;
    for (int i = startNum; i <= endNum; i++) {
      sum += i;
    }
    return sum;
  }

} // end class