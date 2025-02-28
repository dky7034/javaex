public class SwitchDemo {
  public static void main(String[] args) {
    // 메서드 호출
    whoIsIt("호랑이");
    whoIsIt("참새");
    whoIsIt("고등어");
    whoIsIt("곰팡이");

    // 기존 switch 코드
//    String kind = "";
//    String animal = "참새";
//    switch (animal) {
//      case "호랑이":
//        kind = "포유류";
//        break;
//      case "참새":
//        kind = "조류";
//        break;
//      case "고등어":
//        kind = "어류";
//        break;
//      default:
//        kind = "분류할 수 없음";
//    }
//    System.out.println(animal + "는 " + kind+ " 입니다.");

  } // end of main method

  // whoIsIt 메서드 생성
  static void whoIsIt(String animal) {
    String kind = "";
    switch (animal) {
      case "호랑이":
        kind = "포유류";
        break;
      case "참새":
        kind = "조류";
        break;
      case "고등어":
        kind = "어류";
        break;
      default:
        kind = "분류할 수 없음";
    }
    System.out.printf("%s는 %s 입니다.\n", animal, kind);
  }

} // end of class
