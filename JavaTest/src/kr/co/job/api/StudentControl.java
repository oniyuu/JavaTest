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
package kr.co.job.api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentControl {
	Scanner scan = new Scanner(System.in);
	boolean result = true;
	int num;
	int searchStudent;
	
	//학생정보를 담고있는 리스트
	ArrayList<Student> students = new ArrayList<Student>();

	//삭제된 정보를 담고있는 클래스의 객체 생성

	StudentExpel studentdel = new StudentExpel();
	
	//초기값
	void init() {
		// Student s = new Student("홍길동","22","1","영어");
		students.add(new Student("홍길동","27","1","영어"));
		students.add(new Student("고길동","25","2","국어"));
		students.add(new Student("김철수","22","3","수학"));
		students.add(new Student("최영희","28","4","영어"));
		students.add(new Student("신짱구","28","5","영어"));
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
		switch(sel) {
			case "1":
				addStudent();
				break;
				
			case "2":
				updateView();
				break;
				
			case "3":
				deleteStudent();
				break;
				
			case "4":
				studentView();
				break;
				
			default :
				System.out.println("종료");
				System.exit(0);
		}
	}// end of void studentPlay(String sel)

	void addStudent() {
		System.out.println("추가");
		System.out.print("이름 : ");
		String name=scan.next();
		System.out.print("나이 : ");
		String age=scan.next();
		System.out.print("학번 : ");
		String snum=scan.next();
		System.out.print("전공 : ");
		String major=scan.next();
		students.add(new Student(name,age,snum,major));
	}
	
	// 수정메소드 updateView()안에 검색메소드하고 updateStudent()이용
	void updateView() {
		System.out.println("수정메소드입니다.");
		int index;
		String studentNum = "";

		while (true) {
			System.out.print("[학생정보 수정] 학번을 입력하세요 : ");
			studentNum = scan.next();
			index = searchStudent(studentNum); // 학번으로 검색
			if (index >= 0) { // 인덱스값이 있다면
				updateStudent(index); // 수정
				//if(!updateStudent(index)) sysout("수정되었습니다.");
				break;
			} else {
				System.out.println("입력된 학번을 찾지 못했습니다. 다시 입력해주세요."); // 입력오류시 재입력
			}
		}
	}
	
	int searchStudent(String stNum) {
		Iterator<Student> iter = students.iterator();
		// iter.hasnext()   ,  iter.next()
		int index = -1;
		Student stInfo;	//대입할 학생 한명의 정보
		
		while(iter.hasNext()) {   // 다음 학생값이 있다면
			stInfo = iter.next();  // 다음값을 stInfo 대입
			if(stInfo.getSnum().equals(stNum)) {
				index = students.indexOf(stInfo);
				break;
			}
		}
		return index;
	}
	
	// 수정메소드 updateStudent(int index)
	// 1.이름수정 2. 나이수정 3. 학번수정 4. 전공수정
	
	boolean updateStudent(int index) {
		while(result) {
			System.out.println("1.이름수정 2. 나이수정 3. 학번수정 4. 전공수정");
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("이름 : ");
				String name=scan.next();
				break;
				
			case 2:
				System.out.print("나이 : ");
				String age=scan.next();
				break;
				
			case 3:
				System.out.print("학번 : ");
				String snum=scan.next();
				break;
				
			case 4:
				System.out.print("전공 : ");
				String major=scan.next();
				break;
				
			default:
				System.out.println("종료");
				result = false;
			}
		}
		return result; 
	}
	
	//삭제메소드
	void deleteStudent() {
		System.out.println("삭제");
		System.out.println(students);
		System.out.print("몇번째 학생을 삭제하시겠습니까? : ");
		int del = scan.nextInt()-1;
		students.remove(del);
		System.out.println((del+1)+"번째 학생이 삭제되었습니다.");
		System.out.println(students);
		
	}

	void studentView() {
		while(result) {
			System.out.println("1.전체보기 2.학번검색 3.삭제정보");
			System.out.print("번호 : ");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				System.out.println(students);
				break;
				
			case 2:
				System.out.print("학번 : ");
				num = scan.nextInt();
				break;
				
			case 3:
				System.out.print("학번 : ");
				String snum=scan.next();
				break;
			}
		}
	}

}