package array;

import oop.Ball;

public class ArrayDemo5 {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    for (Ball ball : balls) {
      System.out.println("ball = " + ball);
    }
  }
}
