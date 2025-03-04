package test;

public class BookDemo {
  public static void main(String[] args) {
    Book[] books = new Book[3];
    books[0] = new Book(15000);
    books[1] = new Book(50000);
    books[2] = new Book(20000);

  }
}

class Book {
  // 필드
  int price;

  // 생성자
  public Book(int price) {
    this.price = price;
  }

  // 메서드 (Arrays.sort(books)

}
