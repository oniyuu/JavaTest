/*
 * 키보드로 숫자를 입력받아서 0인지 아닌지 확인하는 프로그램을 작성해보자.
 * 
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// 선언부 : 키보드입력, 숫자보관
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String result = null;
		
		// 입력
		System.out.print("Input Number : ");
		//num = scan.nextInt();
		num = Integer.parseInt(scan.next()); //문자열을 정수로 변환
		
		if(num == 0) {
			// 조건이 참일 때
			//System.out.println("num 은 0 입니다.");
			result = "num 은 0 입니다.";
		}
		else {
			//조건이 거짓일 때
			//System.out.println("num 은 0이 아닙니다.");
			result = "num 은 0이 아닙니다.";
		}
		System.out.println(result);
		System.out.println("Program End!!!");

	} //end of main()

} // end of class
