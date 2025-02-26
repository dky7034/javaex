package string;

public class StringDemo {
  public static void main(String[] args) {
    int a = 1;
    int b = a;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    b = 2;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    Cat cat1 = new Cat("나비");
    Cat cat2 = new Cat("야옹이");

    String name = cat1.getName();
    System.out.println("name = " + name);
//    cat2.setName("야옹");
    name = cat2.getName();
    System.out.println("name = " + name);
    System.out.println("cat1 = " + cat1);
    System.out.println("cat2 = " + cat2);
  }
}

class Cat {
  // 생성자
  public Cat(String name) {
    this.name = name;
  }
  // 필드
  private final String name;
  // getter and setter
  public String getName() {
    return name;
  }
//  public void setName(String name) {
//    this.name = name;
//  }
}
