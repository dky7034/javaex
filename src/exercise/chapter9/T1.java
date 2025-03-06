package exercise.chapter9;

public class T1 {
  public static void main(String[] args) {
    Container<String> container1 = new Container<>();
    container1.setT("홍길동");
    String str = container1.getT();

    Container<Integer> container2 = new Container<>();
    container2.setT(6);
    int value = container2.getT();

    System.out.println("str = " + str);
    System.out.println("value = " + value);
  }
}

class Container<T> {
  public T t;

  public Container() {}

  public T getT() {
    return t;
  }
  public void setT(T t) {
    this.t = t;
  }


}

