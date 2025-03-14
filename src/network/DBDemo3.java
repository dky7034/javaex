package network;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection conn = makeConnection();
    String url = "SELECT * FROM person";

    PreparedStatement ps = conn.prepareStatement(url);

    ResultSet rs = ps.executeQuery();


  }
  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
    Connection conn = null;

    Class.forName("com.mysql.cj.jdbc.Driver");
  }
}
