/* DB연결 : Connection 클래스
 * 질의문 작성(저장-> 실행) : Statement 클래스
 * 실행결과 저장 : ResultSet 클래스
 */
package kr.co.job.jdbc;

import java.sql.*;
import java.util.*;

public class DbConnTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;	//데이터베이스 연결
		Statement stmt = null;	//질의문 작성 -> 실행
		ResultSet rs = null;	//결과값 보관
		
		ArrayList<Alist> al = new ArrayList<Alist>();
		Iterator<Alist> iter;
		
		ArrayList<Alist> list = new ArrayList<Alist>();
		Alist tvo;

		try {			
			Class.forName("com.mysql.cj.jdbc.Driver");	//8.0이상 
			
			String url = "jdbc:mysql://localhost/jdbctest?serverTimezone=UTC";	//jdbctest db명 
			String id = "root";
			String pass = "123456";
			
			conn = DriverManager.getConnection(url, id, pass);
			
			System.out.println("연결성공");
			
			//질의문 작성
			String sql = "select tno,pname,age,etc from test01";
			
			//질의문을 stmt에 새로하나 만든 후 실행
			stmt = conn.createStatement();	//질의문이 가능한 stmt을 하나 생성
			rs = stmt.executeQuery(sql);	// 질의문 실행
			
			System.out.println("결과값 조회 보기");
			while(rs.next()) {
				al.add(new Alist(rs.getInt(1), rs.getString("pname"), rs.getInt(3), rs.getString(4)));
			}
			
			for (Alist s : al) {
				System.out.println(s);
			}
			
//			iter = al.iterator();
//			while(iter.hasNext()) {
//				Alist name = iter.next();
//				System.out.println(name);
//			}
			
			System.out.println("End");
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();  // 연결드라이브가 없습니다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
