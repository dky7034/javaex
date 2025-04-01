package madang_database;

import java.sql.*;

public class DBConnectionTest {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    String sql = "SELECT * FROM customer";

    PreparedStatement pstmt = conn.prepareStatement(sql);
    ResultSet rs = pstmt.executeQuery();
    while (rs.next()) {
      System.out.println("custid: " + rs.getString(1));
      System.out.println("name: " + rs.getString(2));
      System.out.println("address " + rs.getString(3));
      System.out.println("phone: " + rs.getString(4));
      System.out.println("==========");
    }

    rs.close();
    pstmt.close();
    conn.close();
  }

  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
    String user = "root";
    String password = "pass1234";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중 ...");
      conn = DriverManager.getConnection(url, user, password);
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("해당 JDBC 드라이버가 존재하지 않습니다.");
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
      System.out.println(e.getMessage());
    }
    return conn;
  }
}



