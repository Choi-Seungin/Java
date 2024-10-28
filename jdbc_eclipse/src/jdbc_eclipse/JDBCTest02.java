package jdbc_eclipse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest02 {

	public static void main(String[] args) {
		try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "C##CHOI", "TIGER")) {
            //conn.setAutoCommit(false); 자동 저장을 끄고 수동 저장으로 변경
            String sql = "insert into person values('0021', '왕씨', 30)";
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println("몇건 적용" + result);
            //  conn.commit(); //수동 저장
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}