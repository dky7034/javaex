package default_package;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      System.out.println(random.nextInt(3)); // 0부터 (3-1) 범위의 무작위 정수 생성
    }
  }
}
