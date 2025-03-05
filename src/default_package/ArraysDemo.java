package default_package;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j', 'a', 'v', 'a'};
    char[] a2 = Arrays.copyOf(a1, a1.length);

    
    for (char c : a2) {
      System.out.println(c);
    }
  }
}
