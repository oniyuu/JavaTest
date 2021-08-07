package kr.co.job.jdbc;

import java.sql.*;
import java.util.*;

public class UpdateTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 : ");
		int num = Integer.parseInt(scan.next());
		System.out.print("나이 : ");
		int age = Integer.parseInt(scan.next());
		System.out.print("비고 : ");
		String etc = scan.next();
		
		// 데이터베이스 연동드라이브 -> 연결
		DbConnection dbConn = new DbConnection();
//		Connection conn = null;
		
		PreparedStatement pstmt = null;
		String mySqlDriver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(mySqlDriver);
			
			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";
			
			dbConn.conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");
			
			String sql = "update test01 set age = ?, etc =? where tno = ?";
			
			pstmt = dbConn.conn.prepareStatement(sql);

			pstmt.setInt(1, age);
			pstmt.setString(2, etc);
			pstmt.setInt(3, num);
			
			int result = pstmt.executeUpdate();
			
			if(result==0)
				System.out.println("데이터 수정 실패");
			else
				System.out.println("1개의 데이터 수정 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (dbConn.conn != null && !dbConn.conn.isClosed())
					dbConn.conn.close();
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
