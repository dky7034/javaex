package enumType;

public class EnumTest {
  public static void main(String[] args) {
    OrderStatus status = OrderStatus.SHIPPED;

    // 잘못된 enum 상수 사용 시도
    // ❌ 컴파일 에러 - SHIPPING이라는 상수가 OrderStatus에 정의되어 있지 않음
    // enum 상수 자체는 변경되거나 새로 생성될 수 없습니다.
    // OrderStatus wrongStatus = OrderStatus.SHIPPING;
  }

}

enum OrderStatus {
  PENDING, SHIPPED, DELIVERED, CANCELLED,
}
