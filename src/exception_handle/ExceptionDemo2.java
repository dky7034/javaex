package exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo2 {
  public static void main(String[] args) {
    try {
      FileInputStream is = new FileInputStream("test.txt");
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
