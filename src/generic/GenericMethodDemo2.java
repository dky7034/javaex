package generic;

public class GenericMethodDemo2 {
  public static void main(String[] args) {
    Ticket[] tickets = new Ticket[3];
    // Ticket: 가격 10_000, 20_000, 15_000
  }

  // 제네릭 메서드
  static <T> int countGT(T[] array, T element) {
    int count = 0;
    for (T t : array) {
      if (t.compareTo(element) > 0) {
        count++;
      }
    }

  }
}