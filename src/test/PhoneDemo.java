package test;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new TelePhone("길동이", "내일"),
        new SmartPhone("민국이", "갤러그")
    };

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
