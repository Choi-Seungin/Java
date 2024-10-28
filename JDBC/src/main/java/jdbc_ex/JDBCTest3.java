package jdbc_ex;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest3 {
    public static void main(String[] args) {
        //person 데이터 한 건을 사용자로부터 입력 받아서
        //데이터 베이스에 추가
        //pid, pname, age 입력 받아서 테이블 추가
        Scanner sc = new Scanner(System.in);
        System.out.println("pid를 입력하세요");
        String pid = sc.nextLine();
        System.out.println("pname을 입력하세요");
        String pname = sc.nextLine();
        System.out.println("age를 입력하세요");
        int age = sc.nextInt();

        try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "C##CHOI", "TIGER")) {
            //String sql = String.format("insert into person values('%s','%s',%d)", pid, pname, age);
            String sql = "insert into person values(?,?,?)";
            PreparedStatement pstmt= conn.prepareStatement(sql);
            pstmt.setString(1, pid);
            pstmt.setString(2, pname);
            pstmt.setInt(3, age);

            int result = pstmt.executeUpdate();
            System.out.println("몇건 적용 : " + result);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
