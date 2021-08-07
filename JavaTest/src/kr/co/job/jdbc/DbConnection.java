/*
 * 데이터베이스 연결 클래스 -> 환경설정파일로 변경 가능
 */

package kr.co.job.jdbc;

import java.sql.*;

public class DbConnection {
	Connection conn;
	
	DbConnection() {
		conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";
			
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
