package test;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new TelePhone("길동이", "내일"),
        new SmartPhone("민국이", "갤러그")
    };

    // 조건문으로 타입을 조사할 때 반드시 !구체적인 것부터 (맨 아래 자손)! 비교해야
    // 올바른 값을 출력할 수 있습니다.
    for (Phone p : phones) {
      if (p instanceof SmartPhone) {
        SmartPhone smartPhone = (SmartPhone) p;
        smartPhone.playGame();
      } else if (p instanceof TelePhone) {
        TelePhone telePhone = (TelePhone) p;
        telePhone.autoAnswering();
      } else if (p instanceof Phone) {
        p.talk();
      }
    }

  }
}
