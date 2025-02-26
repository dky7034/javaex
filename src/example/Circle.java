package example;

class Circle {
  // 필드
  double radius;
  String color;
  //  int numberOfCircles;
  static int numberOfCircles;

  // 생성자 오버로딩
  public Circle() {
//    radius = 10.0;
//    color = "빨강";
    this(10.0, "빨강");
  }

  public Circle(double radius) {
    this(radius, "빨강");
//    if (radius <= 0) {
//      this.radius = 10.0;
//    } else {
//      this.radius = radius;
//    }
  }

  public Circle(String color) {
    this(10.0, color);
//    if (color != null && color.length() > 0) {
//      this.color = color;
//    } else {
//      this.color = "빨강";
//    }
  }

  public Circle(double radius, String color) {
    if (radius <= 0) {
      this.radius = 10.0;
    } else {
      this.radius = radius;
    }
    if (color != null && color.length() > 0) {
      this.color = color;
    } else {
      this.color = "빨강";
    }
    // Circle 객체가 생성될 때마다 1증가 (객체 개수 카운트)
    // 에러: 객체 개수 카운트 불가 (1 고정)
    // 각 개체마다 인스턴스 변수인 numberOfCircles 변수가 생성됨
    // numberOfCircles 변수는 클래스 변수(static 변수)로 작성해 주어야 함
    numberOfCircles++;
  }

  // getter and setter
  public double getRadius() {
    return radius;
  }

  public String getColor() {
    return color;
  }

  public void setRadius(double radius) {
    if (radius <= 0) {
      radius = 10.0;
    } else {
      this.radius = radius;
    }
  }

  public void setColor(String color) {
    if (color != null && color.length() > 0) {
      this.color = color;
    } else {
      this.color = "빨강";
    }
  }

  // 메서드
}
