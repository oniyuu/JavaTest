package kr.co.job.jacom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import kr.co.job.jdbc.Test01VO;

public class JacomConnect {
	Connection conn; // 데이터베이스 연결

	JacomConnect() {
		conn = null;
		try {
			String url = "jdbc:mysql://localhost/jacom?serverTimezone=UTC";
			String id = "root";
			String pass = "1234";

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // 8.0버전 이상 - newinstance : 객체 생성
			conn = DriverManager.getConnection(url, id, pass);
			// System.out.println("연결성공");

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace(); // 연결드라이브가 없습니다.
		} catch (SQLException sqle) {// 데이터베이스 오류
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
