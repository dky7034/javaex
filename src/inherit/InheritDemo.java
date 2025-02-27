package inherit;

public class InheritDemo {
  public static void main(String[] args) {
    Eagle e = new Eagle();
    Tiger t = new Tiger();
    GoldFish g = new GoldFish();

    g.
  }
}

class Animal {
  String eyes;
  String mouth;

  void eat() {
    System.out.println("먹습니다.");
  }

  void sleep() {
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