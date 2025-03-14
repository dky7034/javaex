package thread;

public class ThreadDemo2 {
  public static void main(String[] args) {
    Thread thread = new Thread(
        () -> {
          for (int i = 0; i < 5; i++) {
            System.out.println("잘 가");
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
            }
          }
        }
    );
    thread.start();
    for (int i = 0; i < 5; i++) {
      System.out.println("안녕");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }

  }
}
