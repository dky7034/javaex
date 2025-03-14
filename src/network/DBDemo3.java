package network;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection conn = makeConnection();
    String url = "SELECT * FROM person";

    PreparedStatement ps = conn.prepareStatement();
  }
  private static Connection makeConnection() {
    Strubg
  }
}
