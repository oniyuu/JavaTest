package kr.co.job.jdbc;

import java.sql.*;
import java.util.*;

public class SelectMulti2 {
	static Scanner scan = new Scanner(System.in);
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		boolean result = true;
		int num = 0;

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
		
		while (result) {	
			System.out.println("1.전체조회 2.번호검색 3.이름검색 4.종료");
			System.out.print("번호를 선택해 주세요 : ");
			num = Integer.parseInt(scan.next());

			switch (num) {
			case 1:
				System.out.println("전체조회");
				AllSearch();
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
				try {
					conn.close();
					stmt.close();
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				result = false;
				break;
			}
		}
	}

	private static void AllSearch() {
		try {
			String sql = "select * from test01";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print(" 번호:" + rs.getInt(1));
				System.out.print(" 이름:" + rs.getString(2));
				System.out.print(" 나이:" + rs.getInt(3));
				System.out.println(" 비고:" + rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void SelectSearch() {
		int num = 0;
		try {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void NameSearch() {
		String name = null;
		try {
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

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
