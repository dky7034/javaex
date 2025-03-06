package exercise.chapter9;

public class Ex2 {
  public static void main(String[] args) {
    // Person (이름과 나이)
    // Person (주민번호, 이름)

  }
}

class Person<K, V> {
  private K k;
  private V v;

  public K getK() {
    return k;
  }

  public void setK(K k) {
    this.k = k;
  }

  public V getV() {
    return v;
  }

  public void setV(V v) {
    this.v = v;
  }

}