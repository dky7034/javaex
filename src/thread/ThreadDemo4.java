package thread;

public class ThreadDemo4 {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
      }
    });
    thread.start(); // thread.run(); 비교

    new Thread(new Runnable() {
      @Override
      public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
      }
    }).start();

    new Thread(new Runnable() {
      @Override
      public void run() {
        Thread ct = Thread.currentThread();
        System.out.println(ct.getName());
      }
    }).start();

    Thread ct = Thread.currentThread();
    System.out.println(ct.getName());
  }
}
