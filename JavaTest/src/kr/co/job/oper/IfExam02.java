/*
 * 키보드로 두 수를 입력 받아서 비교하는 프로그램을 작성.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		//선언
		int num1, num2;
		String result = null;
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.print("Input number1 : ");
		num1 = Integer.parseInt(scan.next());
		System.out.print("Input number2 : ");
		num2 = Integer.parseInt(scan.next());
		
		// 처리
		if(num1>num2) {
			result = num1 + "은(는) " + num2 + "보다 큽니다.";
		}
		else {
			result = num1 + "은(는) " + num2 + "보다 작습니다.";
		}
		
		//출력
		System.out.println(result);
		System.out.println("Program End!!");
		
	} //end of main()

} // end of class
