public class SwitchDemo2 {
  public static void main(String[] args) {
    String day = "토";
    String result = "";

    // switch-case 문 (개선된 버전)
    result = switch (day) {
      case "월", "화", "수", "목", "금" -> "평일";
      case "토", "일" -> "주말";
      default -> "구분할 수 없음";
    };
    System.out.printf("%s요일은 %s 입니다.\n", day, result);

    // switch-case 문 (개선된 버전)
    int number = switch (day) {
      case "월", "화", "수", "목", "금" -> 1;
      case "토", "일" -> 2;
      default -> 0;
    };
    System.out.printf("%s요일은 %s 입니다.\n", day, result);
  } // end of main method
} // end of class
