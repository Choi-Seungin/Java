package jdbc_ex;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;

public class JDBCTest5 {
    public static void main(String[] args) {


        try {
            OracleDataSource ods = new OracleDataSource();
            /*ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            ods.setUser("C##CHOI");
            ods.setPassword("TIGER");*/
            ods.setURL("jdbc:oracle:thin:C##CHOI/TIGER@localhost:1521:xe");

            try (Connection conn = ods.getConnection()) {
                System.out.println("데이터베이스 접속 완료");
                String sql = "SELECT * FROM PERSON";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    System.out.println(rs.getString("PID") + "/" + rs.getString(2));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
