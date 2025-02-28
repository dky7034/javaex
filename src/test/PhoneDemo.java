package test;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone[] phones = {
        new Phone("황진이"),
        new TelePhone("길동이", "내일"),
        new SmartPhone("민국이", "갤러그")
    };

    System.out.println(phones[0] instanceof Phone);
    System.out.println(phones[1] instanceof TelePhone);
    System.out.println(phones[2] instanceof SmartPhone);

    for (Phone p : phones) {

      System.out.println(p);

      if ()

      if (p instanceof SmartPhone) {
        p.talk();
      } else if (p instanceof TelePhone) {
        TelePhone telePhone = (TelePhone) p;
        telePhone.autoAnswering();
      } else if (p instanceof SmartPhone) {
        SmartPhone smartPhone = (SmartPhone) p;
        smartPhone.playGame();
      }
    }

  }
}
