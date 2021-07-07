/*
 * 나이를 입력받아서 60세 이상이면 "노인"
 * 30세~59세 "중장년"
 * 29세 미만이면 "청소년"
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfTest04 {

	public static void main(String[] args) {
		// 선언
		int age;
		String result = "중장년";
		Scanner scan = new Scanner(System.in);
		
		// 입력 및 처리
		System.out.print("당신의 나이를 입력하세요. : ");
		age = scan.nextInt();
		
		if (age >= 60) {
			result = "노인";
		}
		else if (age <= 30) {
			result = "청소년";
		}
		
		System.out.println("당신의 나이는 " + age + "세 이며 " + result + "입니다." );
	}

}
