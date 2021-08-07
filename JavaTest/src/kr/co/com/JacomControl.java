package kr.co.job.jacom;

import java.util.Scanner;

public class JacomControl {
	Scanner scan = new Scanner(System.in);
	JacomDAO dao = new JacomDAO();
	
	void start() {
		boolean b = false;
		while (!b) {
			//JacomConnect connect = new JacomConnect();
			dao = new JacomDAO();
			System.out.println("----------------------MENU----------------------");
			System.out.println("1.글 목록보기      2.글 추가하기      3.글 수정하기      4.글 삭제하기      5.종료");
			int num = Integer.parseInt(scan.next());
			

			switch (num) {
			case 1: // 글목록보기
				writingView();
				break;
			case 2: // 글추가하기
				writingAdd();
				break;
			case 3: // 글수정하기
				writingModify();
				break;
			case 4: // 글삭제하기
				writingDelete();
				break;
			case 5: // 종료
				System.out.println("종료");
				b = true;
				break;
			default:
				System.out.println("다시입력해주세요");
			}
		}
	}

	// 글목록보기
	void writingView() {
		dao = new JacomDAO();
		System.out.println("-----------글 목록보기-----------");
		System.out.println("1.전체보기     2.순번보기     3.삭제보기");
		int num = Integer.parseInt(scan.next());
		
		
		switch (num) {
		case 1:
			// 전체보기
			dao.view();
			break;
		case 2:
			// 순번보기
			dao.sequenceView();
			break;
		case 3:
			// 삭제보기
			dao.deleteView();
			break;
		}
	}

	// 글추가하기
	void writingAdd() {
		dao = new JacomDAO();
		System.out.println("-----------글 추가하기-----------");
		dao.add();
	}

	// 글수정하기
	void writingModify() {
		dao = new JacomDAO();
		System.out.println("-----------글 수정하기-----------");
		dao.modify();
	}

	// 글삭제하기
	void writingDelete() {
		dao = new JacomDAO();
		System.out.println("-----------글 삭제하기-----------");
		dao.delete();
	}
}
