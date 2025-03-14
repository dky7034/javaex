package network;

import java.sql.*;

public class DBDemo3 {
  public static void main(String[] args) {
    Connection conn = makeConnection();
    String url = "SELECT * FROM person";

    PreparedStatement ps = conn.prepareStatement(url);

    ResultSet rs = ps.executeQuery();

    System.out.println(rs);

    while (rs.next) {
      System.out.println("name: " + rs.getString(1));
      System.out.println("phone: " + rs.getString("phone"));
      System.out.println("email: " + rs.getString(3));
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
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
      System.out.println(e.getMessage());
    } catch (SQLException) {
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;

  }
}
