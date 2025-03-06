package exercise.chapter9;

public class Ex1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.setItem(Integer.valueOf(100));
  }
}

class Box<T> {
  private T item;

  public T getItem() {
    return item;
  }

  public void setItem(T item) {
    this.item = item;
  }


}