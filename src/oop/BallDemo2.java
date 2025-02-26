package oop;

public class BallDemo2 {
  // 메인 메서드: 프로그램의 시작점
  public static void main(String[] args) {
    // main 메서드 지역 변수 생성(stack 영역)
    int ten = 10;

    System.out.println("myBall = yourBall 연산 전");
    // myBall = yourBall 연산 전
    // Ball 클래스 객체 생성 1:
    // Ball 클래스 객체 myBall 생성(Heap 영역)
    // myBall 객체 내의 인스턴스 변수와 인스턴스 메서드도 myBall 객체 내에 위치하며,
    // 같은 메모리 주소값을 가집니다.
    Ball myBall = new Ball();
    System.out.println(myBall.hashCode());

    // Ball 클래스 객체 생성 2:
    // yourBall 객체도 Heap 영역에 생성됩니다.
    // yourBall 객체는 myBall 객체와는 다른 메모리 주소를 가집니다.
    Ball yourBall = new Ball();
    System.out.println(yourBall.hashCode());

    // myBall = yourBall 연산 후
    // myBall 객체가 yourBall 객체의 주소를 참조하도록 합니다.
    // 두 객체는 하나의 메모리 주소를 가리킵니다. (yourBall)
    System.out.println("myBall = yourBall 연산 후");
    myBall = yourBall;
    System.out.println(myBall.hashCode());
    System.out.println(yourBall.hashCode());

  }
}
