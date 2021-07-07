/*
 * 
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// static(정적) : 메모리에 로드 됨
		int num = 0;
		boolean done = true; // done이 참이면 실행, 거짓이면 종료
		
		while(done) {
			//메뉴 출력 및 메뉴 입력
			
			num = menuPrint();
			
			switch(num) {
			case 1: // 두 수의 합
				sumPrint();

				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 99:
				System.out.println("종료합니다.");
				done = false;
				break;
			default :
				System.out.println("누구냐 넌??");
				break;
			}	
		}

	}

	private static void sumPrint() {
		// TODO Auto-generated method stub
		System.out.println("1입니다. : 두 수의 합");
		int n1=3, n2=5, sum=0;
		sum=n1+n2;
		System.out.println("합 구하기 끝");
		
	}

	//menuPrint() : 메뉴 출력하는 함수
	private static int menuPrint() {
		// TODO Auto-generated method stub
		System.out.println("========== [ Menu ] ==========");
		System.out.println("1.    2.    3.    99.종료");
		System.out.println("==============================");
		System.out.print("번호를 입력하세요 : ");
		
		return scan.nextInt();
	}

}
