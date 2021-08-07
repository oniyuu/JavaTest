/* 데이터베이스 연결테스트 : mySql8.0
 * jar파일 : mysql-connector-java-버전.jar
 * 
 * DriverManager클래스
 * Connection 클래스 이용해서 연결함
 * url, port, id,pass
 * 
 */
package kr.co.job.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnTest {

	public static void main(String[] args) {
		Connection conn = null;

		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");	//오라클
//			Class.forName("com.mysql.jdbc.Driver");   //7.0이하
//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();	//.newInstance()생성자를 발생시키는 인스턴스
			Class.forName("com.mysql.cj.jdbc.Driver"); // 8.0이상

			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC"; // jdbctest db명
			String id = "root";
			String pass = "123456";

			conn = DriverManager.getConnection(url, id, pass);

			System.out.println("연결성공");

		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 연결드라이브가 없습니다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

	}

}
