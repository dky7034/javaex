package test;

public class Phone {
  // 필드
  protected String owner;

  // 생성자
  public Phone(String owner) {
    this.owner = owner;
  }

  // getter and setter

  // 메서드
  void talk() {
    System.out.println("owner가 통화 중입니다.");
  }
}

class TelePhone extends Phone {
  // 필드
  private String when;

  // 생성자
  public TelePhone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  // getter and setter

  // 메서드
  void autoAnswering() {
    System.out.println("owner가 부재중이니 " + when + "에 전화 요망");
  }
}

class SmartPhone extends Phone {
  // 필드
  private String game;

  // 생성자
  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  // getter and setter

  // 메서드
  void playGame() {

  }
}
