public class WhileDemo {
  public static void main(String[] args) {
    // 초기식
    int count = 0;
    // 조건식 - 조건에 맞는 동안 실행
//    while (true) {
//      if (count <= 2) {
//        System.out.println("hello, world");
//      } else {
//        break;
//      }
//      // 증감식
//      count++;
//    }

    // 값 초기화
    count = 0;
    while (count <= 2) {
      System.out.println("hello, world");
      count++;
    }

  } // end of main method
} // end of class
