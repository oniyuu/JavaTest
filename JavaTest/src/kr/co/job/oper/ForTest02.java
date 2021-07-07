/*
 * 1. 정수를 입력받고
 * 2. 1부터 입력받은 수까지 순서대로 출력
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		//int i = 0;
		int sum = 0;
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		//for문 완성
		for(int i=1 ; i<=num ; i++ ) {
			//System.out.println(i);
			sum = sum + i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
		System.out.printf("1부터 %d까지의 합은 %d입니다.%n", num, sum);
	}

}
