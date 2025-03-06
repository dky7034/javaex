package generic;

public class GenericDemo5 {
  public static void main(String[] args) {
    Entry<Integer, String> entry1 = new Entry<>(1, "홍길동");
    

  }
}

class Entry<K, V> {
  private K key;
  private V value;

  public Entry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

}
