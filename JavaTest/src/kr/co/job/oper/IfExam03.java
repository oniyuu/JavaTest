/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// 선언
		int score = 0; // 점수
		//String ch;
		char ch = 'Z';
		Scanner scan = new Scanner(System.in);
		
		// 처리
		System.out.print("점수를 입력하세요 : ");
		//score = Integer.parseInt(scan.next());
		score = scan.nextInt();
		if(score >=90 && score <= 100) {
			//ch = "A";
			ch = 'A';
		}
		else if(score >=80) {
			//ch = "B";
			ch = 'B';
		}
		else if(score >=70) {
			//ch = "C";
			ch = 'C';
		}
		else if(score >=60) {
			//ch = "D";
			ch = 'D';
		}
		else if(score >=50) {
			//ch = "E";
			ch = 'E';
		}
		else {
			//ch = "F";
			ch = 'F';
		}
		// 입력
		
		//출력
		System.out.println("당신의 점수는 " + score + "점이고, 성적은 " + ch + "입니다.");
		System.out.println("End!");
	
	}

}
