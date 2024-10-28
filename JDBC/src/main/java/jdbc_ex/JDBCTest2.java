package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##CHOI", "TIGER")) {
            System.out.println("데이터베이스 접속 완료");
            String sql = "insert into person values('0012', '철씨', 30)";
            //conn.setAutoCommit(false); 자동 저장을 끄고 수동 저장으로 변경
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("몇건 적용 : " + result);
            // conn.commit(); 수동 저장
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
