package exercise.chapter8;

import java.util.Random;

public class Ex4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(new Dice().roll());
    }
  }
}

// Dice 클래스
class Dice {
  // 필드

  // 생성자

  // 메서드
  int roll() {
    Random random = new Random();
    int res = random.nextInt(1, 7);
    return res;
  }
}