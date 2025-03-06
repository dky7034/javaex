package generic;

public class GenericDemo5 {
  public static void main(String[] args) {

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
