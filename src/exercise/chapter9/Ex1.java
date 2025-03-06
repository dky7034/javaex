package exercise.chapter9;

public class Ex1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.setItem(Integer.valueOf(100));
    System.out.println(i.getItem());

    Box<String> s = new Box<>();
    s.setItem("만능이네!");
    System.out.println(s.getItem());
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