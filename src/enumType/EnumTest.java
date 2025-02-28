package enumType;

public class EnumTest {
  public static void main(String[] args) {
    OrderStatus status = OrderStatus.SHIPPED;

    OrderStatus wrongStatus = "SHIPPING";
  }

}

enum OrderStatus {
  PENDING, SHIPPED, DELIVERED, CANCELLED,
}
