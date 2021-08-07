package kr.co.job.jdbc;

import java.sql.*;

public class AllSearch {
	//DbConnection dbcon = new DbConnection();

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	void ASearch() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";

			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");

			String sql = "select * from test01";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(" 번호:" + rs.getInt(1));
				System.out.print(" 이름:" + rs.getString(2));
				System.out.print(" 나이:" + rs.getInt(3));
				System.out.println(" 비고:" + rs.getString(4));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}
