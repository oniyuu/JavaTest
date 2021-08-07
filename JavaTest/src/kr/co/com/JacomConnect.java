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
	Connection conn; // �����ͺ��̽� ����

	JacomConnect() {
		conn = null;
		try {
			String url = "jdbc:mysql://localhost/jacom?serverTimezone=UTC";
			String id = "root";
			String pass = "1234";

			Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // 8.0���� �̻� - newinstance : ��ü ����
			conn = DriverManager.getConnection(url, id, pass);
			// System.out.println("���Ἲ��");

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace(); // �������̺갡 �����ϴ�.
		} catch (SQLException sqle) {// �����ͺ��̽� ����
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
