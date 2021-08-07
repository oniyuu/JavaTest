package kr.co.job.jacom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kr.co.job.jdbc.Test01VO;

public class JacomDAO {
	JacomVO vo;
	JacomConnect connect = new JacomConnect();

	Scanner scan = new Scanner(System.in);
	PreparedStatement pstmt = null;
	Statement stmt = null; // 값을 이미 알고 질의문 작성 후 실행시킴
	ResultSet rs = null; // 결과값 보관
	List<JacomVO> list;

	JacomDAO() {
		list = new ArrayList<JacomVO>();
		try {
			// 질의문 작성
//			String sql = "select bno, title, content, bname, del, etc from freeboardvo";
			String sql = "select * from freeboardvo";

			// stmt 설정
			stmt = connect.conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				vo = new JacomVO();
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String bname = rs.getString(4);
				int del = rs.getInt(5);
				String etc = rs.getString(6);

				vo.setBno(bno);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBname(bname);
				vo.setDel(del);
				vo.setEtc(etc);

				list.add(vo);
			}
		} catch (SQLException sqle) {// 데이터베이스 오류
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	} // end of 생성자

	void view() {
		list = new ArrayList<JacomVO>();
		try {
			// 질의문 작성
//			String sql = "select bno, title, content, bname, del, etc from freeboardvo";
			String sql = "select * from freeboardvo";

			// stmt 설정
			stmt = connect.conn.createStatement();

			rs = stmt.executeQuery(sql);

			System.out.println(" < 1.전체 보기 >");

//			while (rs.next()) {
//				System.out.print(rs.getInt(1)+"\t");
//				System.out.print(rs.getString(2)+"\t");
//				System.out.print(rs.getString(3)+"\t");
//			}
			while (rs.next()) {
				vo = new JacomVO();
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String bname = rs.getString(4);
				int del = rs.getInt(5);
				String etc = rs.getString(6);

				vo.setBno(bno);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBname(bname);
				vo.setDel(del);
				vo.setEtc(etc);

				list.add(vo);
			}

			for (JacomVO str : list) {
				System.out.print(str.getBno() + "\t");
				System.out.print(str.getTitle() + "\t");
				System.out.print(str.getContent() + "\t");
				System.out.print(str.getBname() + "\t");
				System.out.print(str.getDel() + "\t");
				System.out.println(str.getEtc() + "  ");
			}

		} catch (SQLException sqle) {// 데이터베이스 오류
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				if (connect.conn != null && !connect.conn.isClosed()) {
//					connect.conn.close();
//				}
//				if (stmt != null && !stmt.isClosed()) {
//					stmt.close();
//				}
//				if (rs != null && !rs.isClosed()) {
//					rs.close();
//				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// end of view()

	void sequenceView() {
		try {
			System.out.print("게시글 번호 입력 : ");
			int sbno = Integer.parseInt(scan.next());

			// 질의문 작성
			String sql = "select * from freeboardvo where bno = ?";

			pstmt = connect.conn.prepareStatement(sql);
			pstmt.setInt(1, sbno); // sql문이 완성되어있어야함

			rs = pstmt.executeQuery(); // sql문(쿼리문)을 실행

			System.out.println(" < 2.검색 보기 >");
//			boolean srs = rs.next();
//
//			if (srs) { 
//				System.out.print("번호: " + rs.getString(1) + "   ");
//				System.out.print("제목: " + rs.getString(2) + "   ");
//				System.out.print("내용: " + rs.getString(3) + "   ");
//				System.out.print("이름: " + rs.getString(4) + "   ");
//				System.out.print("삭제여부: " + rs.getInt(5) + "   ");
//				System.out.print("비고: " + rs.getNString(6) + "\n");
//			}

			boolean srs = rs.next();

			System.out.println(srs);
			if (srs == true) {
				vo = new JacomVO();
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String bname = rs.getString(4);
				int del = rs.getInt(5);
				String etc = rs.getString(6);

				vo.setBno(bno);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBname(bname);
				vo.setDel(del);
				vo.setEtc(etc);

				//list.add(vo);

				System.out.print(vo.getBno() + "\t");
				System.out.print(vo.getTitle() + "\t");
				System.out.print(vo.getContent() + "\t");
				System.out.print(vo.getBname() + "\t");
				System.out.print(vo.getDel() + "\t");
				System.out.println(vo.getEtc() + "  ");
			}

			// list.get(bno).getBno();
		} catch (SQLException sqle) {// 데이터베이스 오류
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect.conn != null && !connect.conn.isClosed()) {
					connect.conn.close();
				}
				if (stmt != null && !stmt.isClosed()) {
					stmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// end of sequenceView()

	void deleteView() {
		list = new ArrayList<JacomVO>();

		try {
			String sql = "SELECT * from freeboardvo where del = 1";

			stmt = connect.conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				vo = new JacomVO();
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String bname = rs.getString(4);
				int del = rs.getInt(5);
				String etc = rs.getString(6);

				vo.setBno(bno);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBname(bname);
				vo.setDel(del);
				vo.setEtc(etc);

				list.add(vo);
			}

			for (JacomVO str : list) {
				System.out.print(str.getBno() + "\t");
				System.out.print(str.getTitle() + "\t");
				System.out.print(str.getContent() + "\t");
				System.out.print(str.getBname() + "\t");
				System.out.print(str.getDel() + "\t");
				System.out.println(str.getEtc() + "  ");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void add() {
		String setc = null;
		String etc = null;
		System.out.print("제목을 입력하세요 : ");
		String title = scan.next();
		System.out.print("내용을 입력하세요 : ");
		String content = scan.next();
		System.out.print("이름을 입력하세요 : ");
		String bname = scan.next();
		while (setc != "yes" || setc != "no") {
			System.out.print("비고를 입력하시겠습니까? yes or no");
			setc = scan.next();
			if (setc.equals("yes")) {
				System.out.print("비고를 입력하세요 : ");
				etc = scan.next();
				break;
			} else if (setc.equals("no")) {
				System.out.println("비고 값은 널 값입니다.");
				etc = null;
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
		} // end of while

		// System.out.println(etc);
		try {
			String sql = "INSERT INTO freeboardvo (title, content, bname, etc, del) VALUES (?,?,?,?,0)";

			pstmt = connect.conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, bname);
			pstmt.setString(4, etc);

			// list<JacomVO>
			vo = new JacomVO();
			vo.setBno(list.size() + 1);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setBname(bname);
			vo.setDel(0);
			vo.setEtc(etc);

			list.add(vo);

			for (JacomVO str : list) {
				System.out.print(str.getBno() + "\t");
				System.out.print(str.getTitle() + "\t");
				System.out.print(str.getContent() + "\t");
				System.out.print(str.getBname() + "\t");
				System.out.print(str.getDel() + "\t");
				System.out.println(str.getEtc() + "  ");
			}

			int cnt = pstmt.executeUpdate();

			if (cnt == 1) {
				System.out.println("데이터입력 성공");
			} else {
				System.out.println("데이터입력 실패");
			}
		} catch (SQLException sqle) {// 데이터베이스 오류
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (connect.conn != null && !connect.conn.isClosed()) {
					connect.conn.close();
				}
				if (stmt != null && !stmt.isClosed()) {
					stmt.close();
				}
				if (rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // end of add()

	void modify() {
		view();
		list = new ArrayList<JacomVO>();

		try {
			String sql = "select * from freeboardvo";

			stmt = connect.conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				vo = new JacomVO();
				int bno = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String bname = rs.getString(4);
				int del = rs.getInt(5);
				String etc = rs.getString(6);

				vo.setBno(bno);
				vo.setTitle(title);
				vo.setContent(content);
				vo.setBname(bname);
				vo.setDel(del);
				vo.setEtc(etc);

				list.add(vo);
			}

			System.out.print("몇 번 게시글을 수정하실건가요? ");
			int bno = Integer.parseInt(scan.next());
			
			if (list.get(bno-1).getDel() == 1) {
				System.out.println("삭제되었으므로 수정할 수 없습니다.");
			} else if (vo.getDel() == 0) {
				System.out.print("수정할 제목을 입력하세요 : ");
				String title = scan.next();
				System.out.print("수정할 내용을 입력하세요 : ");
				String content = scan.next();
				System.out.print("수정할 이름을 입력하세요 : ");
				String bname = scan.next();
				System.out.print("수정할 비고를 입력하세요 : ");
				String etc = scan.next();

				try {

					// UPDATE [테이블] SET [열] = '변경할값' WHERE [조건]
					String rsql = "UPDATE jacom.freeboardvo SET title=?, content=?, bname=?, etc=? WHERE bno=?, del=0";

					pstmt = connect.conn.prepareStatement(rsql);
					pstmt.setString(1, title);
					pstmt.setString(2, content);
					pstmt.setString(3, bname);
					pstmt.setString(4, etc);
					pstmt.setInt(5, bno);

					// list<JacomVO>
					vo = new JacomVO();
					vo.setBno(bno);
					vo.setTitle(title);
					vo.setContent(content);
					vo.setBname(bname);
					vo.setDel(0);
					vo.setEtc(etc);

					list.add(vo);

					int cnt = pstmt.executeUpdate();

					if (cnt == 1) {
						System.out.println("데이터입력 성공");
					} else
						System.out.println("데이터입력 실패");
					view();
				} catch (SQLException sqle) {// 데이터베이스 오류
					sqle.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (connect.conn != null && !connect.conn.isClosed()) {
							connect.conn.close();
						}
						if (stmt != null && !stmt.isClosed()) {
							stmt.close();
						}
						if (rs != null && !rs.isClosed()) {
							rs.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}// end of modify()

	void delete() {
		view();
		System.out.print("몇 번 게시글을 삭제하실건가요? ");
		int bno = Integer.parseInt(scan.next());

		try {
			String sql = "UPDATE freeboardvo SET del = 1 WHERE bno=?";

			pstmt = connect.conn.prepareStatement(sql);
			pstmt.setInt(1, bno);

			vo.setDel(1);

			list.add(vo);

			int cnt = pstmt.executeUpdate();

			if (cnt == 1) {
				System.out.println("데이터삭제 성공");
			} else
				System.out.println("데이터삭제 실패");
			view();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}