package network;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection conn = makeConnection();
    String url = "SELECT * FROM person";

    PreparedStatement ps = conn.prepareStatement(url);
  }
  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
    Connection con = null;
  }
}
