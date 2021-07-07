/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요.
 * 점수가
 * 97이상이면 A+ 96~94이면 A0, 93이하이면 A-
 * 87이상이면 B+ 86~84이면 B0, 83이하이면 B-
 * 77이상이면 C+ 76~74이면 C0, 73이하이면 C-
 * 67이상이면 D+ 66~64이면 D0, 63이하이면 D-
 * 57이상이면 E+ 56~54이면 E0, 53이하이면 E-
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_1 {

	public static void main(String[] args) {
		// 선언
		int score = 0; // 점수
		char ch = 'Z';
		char buho = '0'; // 부호
		Scanner scan = new Scanner(System.in);
		
		// 입력 및 처리
		System.out.print("점수를 입력하세요 : ");
		score = scan.nextInt();
		if(score >=90 && score <= 100) {
			ch = 'A';
			if(score >=97 ) {
				buho = '+';
			}
			else if(score <=93 ) {
				buho = '-';
			}
		}
		else if(score >=80) {
			ch = 'B';
			if(score >=87 ) {
				buho = '+';
			}
			else if(score <=83 ) {
				buho = '-';
			}
		}
		else if(score >=70) {
			ch = 'C';
			if(score >=77 ) {
				buho = '+';
			}
			else if(score <=73 ) {
				buho = '-';
			}
		}
		else if(score >=60) {
			ch = 'D';
			if(score >=67 ) {
				buho = '+';
			}
			else if(score <=63 ) {
				buho = '-';
			}
		}
		else if(score >=50) {
			ch = 'E';

		}
		else {
			ch = 'F';
		}

		//출력
		System.out.println("당신의 점수는 " + score + "점이고, 성적은 " + ch + buho + "입니다.");
		System.out.println("End!");
	
	}

}
