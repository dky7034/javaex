package exercise.chapter7;

public class Ex6 {
  public static void main(String[] args) {

  }
}

interface Human {
  void eat();
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}