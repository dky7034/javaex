package exception_handle;

public class UncheckedDemo3 {
  public static void main(String[] args) {
    int[] array = {0, 1, 2};
    try {
      System.out.println(array[5]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
      System.out.println("배열에 해당 원소가 존재하지 않습니다.");
    }

  }
}
