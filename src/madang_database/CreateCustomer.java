package madang_database;

import java.sql.*;
import java.util.Scanner;

public class CreateCustomer {
  public static void main(String[] args) throws SQLException {
    // 고객명, 주소, 전화번호를 입력받은 후 customer 테이블에 고객 자료를 추가하시오.
    Connection conn = makeConnection();
    Scanner in = new Scanner(System.in);

    // 마지막 custid 값 구하기
    String sql1 = "SELECT max(custid) FROM customer";
    int newCustId = 1;

    PreparedStatement ps1 = conn.prepareStatement(sql1);
    ResultSet rs = ps1.executeQuery();
    if (rs.next()) {
      newCustId = rs.getInt(1) + 1;
    }

    // 사용자 입력 받기
    System.out.print("이름 입력: ");
    String name = in.nextLine();
    System.out.print("주소 입력: ");
    String address = in.nextLine();
    System.out.print("전화번호 입력: ");
    String phone = in.nextLine();

    // INSERT 쿼리 실행
    String sql2 = "INSERT INTO customer (custid, name, address, phone) VALUES (?, ?, ?, ?)";

    PreparedStatement ps2 = conn.prepareStatement(sql2);
    ps2.setString(1, String.valueOf(newCustId));
    ps2.setString(2, name);
    ps2.setString(3, address);
    ps2.setString(4, phone);

    int result = ps2.executeUpdate();
    System.out.println(result + "개의 고객 정보가 추가되었습니다.");
  } // end of main method

  // 특정 JDBC 드라이버와 연결을 맺기 위한 메서드
  private static Connection makeConnection() {
    //
    String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
    Connection conn = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중 ...");
      conn = DriverManager.getConnection(url, "root", "pass1234");
      System.out.println("데이터베이스 연결 성공");
    } catch (ClassNotFoundException e) {
      System.out.println("JDBC 드라이버를 찾지 못했습니다.");
      System.out.println(e.getMessage());
    } catch (SQLException e) {
      System.out.println("데이터베이스 연결 실패");
    }
    return conn;
  } // end of makeConnection method

} // end of class
