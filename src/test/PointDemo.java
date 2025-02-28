package test;

public class PointDemo {
  public static void main(String[] args) {
    Point point = new Point(3, 5);
    MovablePoint movablePoint = new MovablePoint(point.getX(), point.getY(), 30, 60);
    
  }
}
