package generic;

public class GenericMethodDemo2 {
  public static void main(String[] args) {
    Ticket[] tickets = new Ticket[3];
    // Ticket: 가격 10_000, 20_000, 15_000
    tickets[0] = new Ticket(10000);
    tickets[1] = new Ticket(20000);
    tickets[2] = new Ticket(15000);
    countGT(tickets, tickets[2]);
  }

  // 제네릭 메서드
  static <T> int countGT(T[] array, T element) {
    int count = 0;
    for (T t : array) {
      if (t.compareTo(element) > 0) {
        count++;
      }
    }
    return count;
  }

} // end of class

class Ticket {
  int price;
  public Ticket(int price) {
    this.price = price;
  }

  public int CompareTo(Ticket t) {
    return 0;
  }
}