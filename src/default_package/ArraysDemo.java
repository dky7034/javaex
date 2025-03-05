package default_package;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, 2);

    System.out.println("a1 = " + a1);
    System.out.println("a2 = " + a2);
  }
}
