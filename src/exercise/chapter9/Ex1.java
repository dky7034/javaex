package exercise.chapter9;

public class Ex1 {
  public static void main(String[] args) {

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