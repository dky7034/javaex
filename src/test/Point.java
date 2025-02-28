package test;

public class Point {
  // 필드
  private int x, y;

  // 생성자
  public Point(int x, y) {
  }

  // 메서드
  // getter and setter
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  // 다른 메서드
  void method() {

  }

  // toString() override
  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }
}

class MovablePoint extends Point {
  // 필드
  private int xSpeed, ySpeed;

  // 생성자
  public MovablePoint() {
  }

  // 메서드
  // getter and setter
  public int getxSpeed() {
    return xSpeed;
  }

  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }

  public int getySpeed() {
    return ySpeed;
  }

  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }

  // toString() override
  @Override
  public String toString() {
    return "MovablePoint{" +
        "x=" + x +
        "y=" + y +
        "xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        '}';
  }
}
