package exception_handle;

public class UncheckedDemo3 {
  public static void main(String[] args) {
    int[] array = {0, 1, 2};
    try {
      System.out.println(array[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }

  }
}
