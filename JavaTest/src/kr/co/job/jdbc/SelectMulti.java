package kr.co.job.jdbc;

import java.sql.*;
import java.util.*;

public class SelectMulti {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		boolean result = true;
		AllSearch as = new AllSearch();

		while (result) {
			System.out.println("1.전체조회 2.번호검색 3.이름검색 4.종료");
			System.out.print("번호를 선택해 주세요 : ");
			num = Integer.parseInt(scan.next());

			switch (num) {
			case 1:
				System.out.println("전체조회");
				//AllSearch();
				as.ASearch();
				break;
			case 2:
				System.out.println("선택조회");
				SelectSearch();
				break;
			case 3:
				System.out.println("이름조회");
				NameSearch();
				break;
			case 4:
				result = false;
				break;
			}
		}
	}

//	private static void AllSearch() throws SQLException {
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//
//			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
//			String id = "root";
//			String pass = "123456";
//
//			conn = DriverManager.getConnection(url, id, pass);
//			System.out.println("연결성공");
//
//			String sql = "select * from test01";
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
//
//			while (rs.next()) {
//				System.out.print(" 번호:" + rs.getInt(1));
//				System.out.print(" 이름:" + rs.getString(2));
//				System.out.print(" 나이:" + rs.getInt(3));
//				System.out.println(" 비고:" + rs.getString(4));
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			conn.close();
//			stmt.close();
//			rs.close();
//		}
//	}

	private static void SelectSearch() throws SQLException {
		Scanner scan = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";

			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");

			System.out.print("조회할 번호 : ");
			num = Integer.parseInt(scan.next());

			String sql = "select * from test01 where tno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(" 번호:"+rs.getInt(1));
				System.out.print(" 이름:"+rs.getString(2));
				System.out.print(" 나이:"+rs.getInt(3));
				System.out.print(" 비고:"+rs.getString(4)+"\n");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
			pstmt.close();
			rs.close();
		}
	}

	private static void NameSearch() throws SQLException {
		Scanner scan = new Scanner(System.in);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String name = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";
			String id = "root";
			String pass = "123456";

			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("연결성공");

			System.out.print("조회할 이름 : ");
			name = scan.next();

			String sql = "select * from test01 where pname=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				System.out.print(" 번호:"+rs.getInt(1));
				System.out.print(" 이름:"+rs.getString(2));
				System.out.print(" 나이:"+rs.getInt(3));
				System.out.print(" 비고:"+rs.getString(4)+"\n");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			conn.close();
			pstmt.close();
			rs.close();
		}
	}
}
