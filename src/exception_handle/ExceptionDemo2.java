package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
  public static void main(String[] args) {
    FileInputStream is = null;
    try {
      is = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {

    }
  }
}
