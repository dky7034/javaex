package madang_database;

import java.sql.*;

public class CreateDBConnectionTest {
  public static void main(String[] args) {

    try {
      // 1. JDBC 드라이버 클래스를 JVM 에 로드합니다.
      // 이 클래스가 로딩되면서 static 블록을 통해 DriverManager 에 드라이버가 등록됩니다.
      Class.forName("com.mysql.cj.jdbc.Driver");

      // 2. 드라이버 매니저를 통해 데이터베이스에 연결합니다.
      // 연결 정보에는 DBMS 종류, 위치, 포트, DB 이름 옵션 등이 포함됩니다.
      String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
      Connection connection = DriverManager.getConnection(url, "root", "pass1234");

      // 3. SQL 을 실행할 Statement 객체를 생성합니다.
      // Statement 는 정적인 SQL (파라미터 없는 쿼리)을 실행할 때 사용합니다.
      Statement statement = connection.createStatement();

      // 4. SQL 쿼리를 작성하고, 실행하여 결과(ResultSet)를 받습니다.
      String sql = "SELECT * FROM customer";
      ResultSet rs = statement.executeQuery(sql);

      // 5. ResultSet 을 순회하며 결과 데이터를 출력합니다.
      while (rs.next()) {
        System.out.println("고객명: " + rs.getString("name"));
      }

      // 6. 사용한 JDBC 자원은 반드시 닫아야 합니다. (생성 역순으로 close)
      rs.close();
      statement.close();
      connection.close();

    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
