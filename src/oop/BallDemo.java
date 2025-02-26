package oop;

public class BallDemo {
  public static void main(String[] args) {
    Ball ball = new Ball();
    double radius = ball.radius;
    double volume = ball.getVolume();
    System.out.println("radius = " + radius);
    System.out.println("volume = " + volume);

    // static 메서드 호출 (클래스명으로 호출 가능)
    Ball.print();

    Ball b = new Ball(5.0);
    System.out.println(b.radius);
  }
}
