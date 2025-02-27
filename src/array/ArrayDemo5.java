package array;

import oop.Ball;

public class ArrayDemo5 {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    balls[0] = new Ball(5);
    double volume = balls[0].getVolume();

    System.out.println("volume = " + volume);
    for (Ball ball : balls) {
      if (ball != null) {
        System.out.println("ball = " + ball);
        System.out.println(ball.radius);
      }

    }
  }
}
