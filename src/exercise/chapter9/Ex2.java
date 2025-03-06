package exercise.chapter9;

public class Ex2 {
  public static void main(String[] args) {
    // Person (이름과 나이)
    Person<String, Integer> p1 = new Person<>("홍길동", 20);
    // Person (주민번호, 이름)
    Person<String, String> p2 = new Person<>("111111", "손흥민");

    System.out.println(p1.getK());
    System.out.println(p1.getV());

    System.out.println(p2.getK());
    System.out.println(p2.getV());
  }
}

class Person<K, V> {
  private K k;
  private V v;

  public Person(K k, V v) {
    this.k = k;
    this.v = v;
  }

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