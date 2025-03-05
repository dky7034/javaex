package default_package;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, 2);
    System.out.println(a1);
    System.out.println(a2);

    String[] sa = {"케이크", "애플", "도넛", "바나나"};
    System.out.println(Arrays.toString(sa));

    // 오름차순 정렬
    Arrays.sort(sa);
    
  }
}
