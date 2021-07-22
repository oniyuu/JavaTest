/* 학생관리를 제어하는 클래스
 * 1. 초기값  : init()
 * 2. 화면메뉴 : menuView()
 *     // 1.추가 2. 수정 3. 삭제 4. 보기, 99종료
 *      
 * 3. 학생추가 : void addStudent()
 * 4. 학생수정 : updateStudent()
 *    - 1. 이름 2. 나이 3. 학번 4.전공
 * 5. 학번검색 : int searchStudent(학번)
 *             찾으면 index, 못찾으면 index=-1 return
 *   
 * 6. 학생삭제 :  deleteStudent()
 *    => 삭제된 학생을 StudentExpel클래스에서 저장
 *     
 * 7. 학생조회(출력) : studentView()
 *        1. 전체보기 2. 학번검색 3. 삭제정보    
 */
package kr.co.dong.checking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentControl {
	Scanner scan = new Scanner(System.in);
	//학생정보를 담고있는 리스트

	//삭제된 정보를 담고있는 클래스의 객체 생성

	
	//초기값
	void init() {
		// Student s = new Student("홍길동","22","1","영어");
		students.add(new Student("","27","1","영어"));
		students.add(new Student("","25","2","국어"));
		students.add(new Student("","22","3","수학"));
		students.add(new Student("","28","4","영어"));
		students.add(new Student("","28","5","영어"));
	}
	
	//기본메뉴 출력메소드
	String menuView() {
		//init();  여기아닙니다 큰일납니당~
		System.out.println("1.추가, 2. 수정, 3.삭제, 4 보기, 기타. 종료");		
		return scan.next();  // 입력된 데이터를 리턴. 공백까지만 입력받음
	}	
	//동작을 구현해보자  studentPlay(menuView())
	void studentPlay(String sel) {
		//"1.추가, 2. 수정, 3.삭제, 4 보기, 기타. 종료"

	}// end of void studentPlay(String sel)

	void addStudent() {
		
	}
	
	// 수정메소드 updateView()안에 검색메소드하고 updateStudent()이용
	void updateView() {
	
	}
	
	// 수정메소드 updateStudent(int index)
	// 1.이름수정 2. 나이수정 3. 학번수정 4. 전공수정
	
	boolean updateStudent(int index) {

	}
	

	//삭제메소드
	void deleteStudent() {

		
	}

	void studentView() {

	}

}
