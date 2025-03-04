package abstract_interface;

public interface Movable {
  // 반드시 가져야 하는 기능
  void move(int x);
}

class Car implements Movable {
  private int pos = 0;
  @Override
  public void move(int x) {
    pos += x;
    show();
  }

  public void show() {
    System.out.println("자동차는 " + pos + "m 만큼 이동했습니다.");
  }
}
