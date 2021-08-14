/*
 * 프로젝트 명 : 제대로 된 회원가입
 * 
 * - 회원가입 양식
 * 이름 : 정민석
 * 나이 : 25
 * 성별 : 남자
 * 주민등록번호 : 970527-1xxxxxx(뒷자리는 1,2,3,4 만 알맞게 입력)
 * 아이디 : wnfhcm12
 * 비밀번호 : 민석1234
 * 비밀번호확인 : 민석1234
 * 
 * 조건 1(나이 확인)
 * - 입력받은 나이와 주민등록번호 대조해서, 알맞게 입력한지 체크하기(빠른생년 없음)
 * ex) 970527  =   해당 년 - 입력한 년도 알맞게 한 후 나이 체크하기
 * + 2021년을 입력하는것이 아닌 Date() 사용해보기
 * 
 * 조건 2(주민번호 확인)
 * - 주민등록번호가 앞자리 6자리  이후 '-'  이후 뒷자리 7자리인지체크하기
 * - 주민등록번호 00년생부터   남자 3   여자 4 인지 체크하기
 * 
 * 조건 3 (아이디 확인)
 * 3-1, 아이디는 모두 소문자로 치환한다.
 * 3-2, 아이디에 알파벳 소문자, 숫자, ( _ )언더바 , ( . )마침표 을 제외한 모든 문자는 제거한다.
 * 3-3, 아이디가 8글자 이하라면 마지막 문자를 반복한다
 * 3-3 ex) 아이디 : wnfh1 입력시  wnfh1111  로 변경
 * 3-4 아이디 시작과 끝에 마침표가 있을 경우 삭제한다.
 * 
 * 조건 4 (비밀번호 확인)
 * 4-1 비밀번호는 대문자, 소문자, 숫자, 특수문자 중 3가지 이상 포함되어야 한다.
 * 4-2 비밀번호와 비밀번호확인이 같을 경우에만 회원가입이 완료된다.
 */
package kr.co.join;

import java.util.*;

public class DbControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		String sex = null;
		String jumin = null;
		String id = null;
		// String[] puncts =
		// {"`","~","!","@","#","$","%","^","&","*","(",")","-","=","+","[","]","{","}","\"","|",";",":","'",",","<",">","/","?","
		// "};

		String passwd = null;
		String passwd2 = null;
		// String pattern =
		// "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,20}$";
		// // 영문, 숫자, 특수문자
		boolean result = true;

		System.out.print("이름 : ");
		name = scan.next();

//		System.out.print("나이 : ");
//		age = Integer.parseInt(scan.next());
//		
//		System.out.print("성별 : ");
//		sex = scan.next();

		while (result) {
			System.out.print("주민등록번호 ex) 123456-1234567 : ");
			jumin = scan.next();

			if (jumin.length() == 14) {
				if (jumin.charAt(0) == '0') {
					if (jumin.charAt(7) == '3') {
						sex = "남자";
						result = false;
					} else if (jumin.charAt(7) == '4') {
						sex = "여자";
						result = false;
					} else {
						System.out.println("유효하지 않은 주민등록 번호 입니다.");
						continue;
					}
				} else if (jumin.charAt(7) == '1') {
					sex = "남자";
					result = false;
				} else if (jumin.charAt(7) == '2') {
					sex = "여자";
					result = false;
				} else {
					System.out.println("유효하지 않은 주민등록 번호 입니다.");
					continue;
				}

			} else {
				System.out.println("13자리를 정확히 입력해 주세요.");
			}
		}

		System.out.print("ID : ");
		id = scan.next();
		id = id.replaceAll("`~!@#[$]%^&[*]\\(\\)-=[+]\\[\\]\\{\\}|;:'<>/?", "");
		id = id.toLowerCase();
		// name = String.format("%8s", name);

		result = true;
		while (result) {
			System.out.print("암호 : ");
			passwd = scan.next();

			System.out.print("암호확인 : ");
			passwd2 = scan.next();
			if (passwd.equals(passwd2)) {
				System.out.println("회원가입이 완료되었습니다.");
				result = false;
			} else {
				System.out.println("암호가 다릅니다. 다시 입력해 주세요.");
			}

		}
		System.out.println(name);
		System.out.println(sex);
		System.out.println(jumin);
		System.out.println(id);
		System.out.println(passwd);
	}

}
