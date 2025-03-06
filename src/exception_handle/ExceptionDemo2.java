package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo2 {
  public static void main(String[] args) {
    FileInputStream is = null;
    try {
      is = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        is.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
