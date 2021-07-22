/*
 * 1.시스템 초기화
 * 2.메뉴 구성
 * 3.각 선택메뉴별 기능
 * -회원가입, 회원수정, 회원삭제, 회원조회(전체조회), 개별조회
 */
package kr.co.job.api;

import java.util.Scanner;

public class MemberControl {
	
	static Scanner scan = new Scanner(System.in); //콘솔입력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("회원가입을 시작합니다");
		Member m1; // 선언
		
		//입력
		System.out.print("번호를 입력하세요 : ");
		int no = Integer.parseInt(scan.next());
		
		System.out.print("아이디를 입력하세요 : ");
		String id = scan.next();
		
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(scan.next());
		
		// m1의 필드값을 입력받은 데이터로 초기화해서 생성함.
		//m1 = new Member(no, id, name, age);
		m1 = new Member();
		m1.setNo(no);
		m1.setName(name);
		m1.setId(id);
		m1.setAge(age);
		System.out.println("회원가입이 완료되었습니다.");
		
		//회원정보 조회
		System.out.println("회원정보 조회");
		System.out.println("번호 : "+ m1.getNo());
		System.out.println("아이디 : " + m1.getId());
		System.out.println("이름 : " + m1.getName());
		System.out.println("나이 : " + m1.getAge());
		
		//수정하기
		//1.번호 2.아이디 3.이름 4.나이 99.종료
		
		boolean result = true;
		int number = 0;
		
		while(result) {
			System.out.println("=============수정메뉴=============");
			System.out.println("1.번호 2.아이디 3.이름 4.나이 99.종료");
			System.out.println("================================");
			System.out.print("select Number : ");
			number = scan.nextInt();
			
			switch(number) {
				case 1:
					System.out.print("수정할 번호를 입력하세요 : ");
					no = Integer.parseInt(scan.next());
					m1.setNo(no);
					System.out.println("수정된 번호 : "+ m1.getNo());
				break;
				
				case 2:
					System.out.print("수정할 아이디를 입력하세요 : ");
					id = scan.next();
					m1.setId(id);
					System.out.println("수정된 아이디 : " + m1.getId());
				break;
				
				case 3:
					System.out.print("수정할 이름을 입력하세요 : ");
					name = scan.next();
					m1.setName(name);
					System.out.println("수정된 이름 : " + m1.getName());
				break;
				
				case 4:
					System.out.print("수정할 나이를 입력하세요 : ");
					age = Integer.parseInt(scan.next());
					m1.setAge(age);
					System.out.println("수정된 나이 : " + m1.getAge());
				break;
				
				case 99:
					System.out.println("수정된 정보");
					System.out.println(m1);
					result =false;
				break;
			
			}
		}
	}

}
