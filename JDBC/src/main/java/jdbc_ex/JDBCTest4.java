package jdbc_ex;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest4 {
    public static void main(String[] args) {
        //학생 이름 일부를 입력 받아서
        //해당하는 학생 정보를 조회해서 출력
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름 일부를 입력하세요.");
        String name = sc.nextLine();

        try(Connection conn = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "C##CHOI", "TIGER")) {
            String sql = "select * from student where std_name like '%' || ? || '%'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(
                        rs.getString("std_no") + "/"
                                + rs.getString("std_name") + "/"
                                + rs.getString("major_no") + "/"
                                + rs.getString("std_score"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}