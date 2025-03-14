package network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection conn = makeConnection();
    String url = "SELECT * FROM person";

    PreparedStatement ps = conn.prepareStatement(url);

    ResultSet rs = ps.executeQuery();

    System.out.println(rs);

    while (rs.next) {
      System.out.println(rs.);
    }

  }
  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/contacts?serverTimezone=Asia/Seoul";
    Connection conn = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중 ...");
      conn = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      
    }


  }
}
