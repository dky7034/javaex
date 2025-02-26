package example;

class CircleDemo {
  public static void main(String[] args) {
    Circle circle = new Circle();
//    System.out.println(circle.color);
//    System.out.println(circle.radius);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", circle.numberOfCircles);

    Circle circle1 = new Circle(-5, "");
//    System.out.println(circle.color);
//    System.out.println(circle.radius);
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", circle1.numberOfCircles);

    Circle circle2 = new Circle();
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", circle2.numberOfCircles);

    Circle circle3 = new Circle();
    System.out.printf("총 %d 개의 공이 만들어졌습니다. \n", circle3.numberOfCircles);
  }
}
