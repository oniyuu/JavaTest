/*
 * [메소드 호출]
 * 기능 : 특정 문자를 회ㅏㅅ수만큼 출력하는 메소드 만들기
 * void printCharacter(char ch, int number) : 메소드 원형
 */
package kr.co.job.func;

public class ExamMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacter('*', 3);
		printCharacter('$', 10);
		printCharacter("hello", 10);

	}

	private static void printCharacter(String str, int num) {
		System.out.println("반복출력 임무 시작");
		for(int i=1 ; i<=num; i++) {
			System.out.print(str+" ");			
		}
		System.out.println("\n종료");
		
	}

	private static void printCharacter(char ch, int num) {
		System.out.println("반복출력 임무 시작");
		for(int i=1 ; i<=num; i++) {
			System.out.print(ch);	
		}
		System.out.println("\n종료");
		
	}

}
