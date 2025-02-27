package exercise;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("URL을 입력하세요: ");
    String url = in.nextLine();
    if (url.endsWith("com")) {
      System.out.println(url + "은 \'com\'으로 끝납니다.");
    }
    if (url.contains("java")) {

    }
    if (url.startsWith("www")) {

    }
  }
}
