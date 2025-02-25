package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo2 {
  public static void main(String[] args) {
    // 1. 3명의 성 (김, 이, 박)을 저장하는 동적 배열 names를 선언
    // 2. 김, 이, 박을 동적 배열 names에 저장
    // 3. names에 저장된 내용을 확인하고, 동적 배열의 크기를 확인
    // 4. 동적 배열에 저장된 요소 중에서 길이가 4인 요소를 찾음
    // 5. 4번에서 찾은 요소 중 첫 번째 요소만 삭제
    // 6. names에 저장된 내용을 확인하고, 동적 배열의 크기를 출력

    // 사용자로부터 성을 입력받기 위한 Scanner 객체 생성
    Scanner in = new Scanner(System.in);

    // 동적 배열 ArrayList 선언 및 생성
    ArrayList<String> names = new ArrayList<>();
    // 김, 이, 박을 동적 배열 names에 저장 (사용자에게 입력받음)
//    System.out.print("성을 입력해 주세요(영어로): ");
//    names.add(in.nextLine());
    names.add("kim");
    names.add("lee");
    names.add("park");
    names.add("kang");
    names.add("kwon");
    // 향상된 for 문으로 저장된 내용을 확인하고, 동적 배열의 크기를 확인
    System.out.println("요소 삭제 전 출력");
    for (String name : names) {
      System.out.println("name = " + name);
    }
    System.out.println("names.size(): " + names.size());

    // 구분선 출력
    System.out.println("================================");

    // 길이가 4인 요소를 찾음
    for (int i = 0; i < names.size(); i++) {
      String name = names.get(i);
      if (name != null && name.length() == 4) {
        System.out.println("길이가 4인 요소 출력: " + name);
        // 길이가 4인 요소 삭제
        names.remove(i);
        break;
      }
    }

    // names에 저장된 내용을 확인하고, 동적 배열의 크기를 출력
    System.out.println("요소 삭제 후 출력");
    for (String name : names) {
      System.out.println("name = " + name);
    }
    System.out.println("names.size(): " + names.size());

  }
}
