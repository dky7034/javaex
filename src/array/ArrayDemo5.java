package array;

import oop.Ball;

public class ArrayDemo5 {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    balls[0] = new Ball(5);
    balls[1] = new Ball(10);

    for (Ball ball : balls) {
      if (ball != null) {
        System.out.println(ball);
      } else {
        System.out.println("null입니다.");
      }

    }
  }
}
