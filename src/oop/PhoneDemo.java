package oop;

public class PhoneDemo {
  public static void main(String[] args) {
    // Phone 클래스 객체 생성
    Phone myPhone = new Phone();
    Phone yourPhone = new Phone();

    int myPhoneValue = myPhone.value = 100;
    String myPhoneModel = myPhone.model = "갤럭시 S25";

    int yourPhoneValue = yourPhone.value = 80;
    String yourPhoneModel = yourPhone.model = "G6";

    myPhone.print();
    yourPhone.print();
  }
}
