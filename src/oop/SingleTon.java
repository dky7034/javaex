package oop;

public class SingleTon {
  // 클래스 내부에서 싱글톤 객체 생성
  private SingleTon singleTon = new SingleTon();

  // 싱글톤 생성자를 private 으로 선언하여 객체를 외부에서 생성하지 못하도록 숨김
  private SingleTon() {}

  // 싱글톤 객체를 리턴해주는 메서드 (오직 이 메서드를 통해서만 싱글톤 객체를 호출할 수 있음)
  public static SingleTon getInstance() {
    return singleTon;
  }

  // 메서드
  void method() {
    System.out.println("싱글톤 메서드입니다.");
  }
}
