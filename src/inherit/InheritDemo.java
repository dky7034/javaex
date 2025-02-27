package inherit;

public class InheritDemo {
  public static void main(String[] args) {
    Eagle e = new Eagle();
  }
}

class Animal {
  String eyes;
  String mouth;

  void eat() {
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