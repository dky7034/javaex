package inherit;

public class InheritDemo {
  public static void main(String[] args) {
    Eagle e = new Eagle();
    Tiger t = new Tiger();
    GoldFish g = new GoldFish();

    e.sleep();
    e.eat();

    t.sleep();
    t.eat();

    g.sleep();
    g.eat();
  }
}

class Animal {
  String eyes;
  String mouth;

  void eat() {
    System.out.println("먹습니다.");
  }
  void sleep() {
    System.out.println("잡니다.");
  }
}

class Eagle extends Animal {
  String wing;
  void fly() {
  }
}

class Tiger extends Animal {
  String leg;
  void run() {
  }
}

class GoldFish extends Animal {
  String fin;
  void swim() {
  }
}