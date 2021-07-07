/*
 * 두 수를 입력 받아서
 * 작은 수에서 큰 수까지 출력
 */

package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, min=0, max=0, sum=0;
		
		System.out.print("first number : ");
		num1 = scan.nextInt();
		
		System.out.print("second number : ");
		num2 = scan.nextInt();
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}
		else {
			max=num2;
			min=num1;
		}
		//System.out.println("첫번째 숫자 : " + num1);
		//System.out.println("두번째 숫자 : " + num2);
		System.out.println("작은 값 : " + min);
		System.out.println("큰 값 : " + max);
		
		for( int i=min ; i<=max ; i++ ) {
			sum = sum + i;
			System.out.println("i="+i+" 일 때 sum=" + sum);
			// i가 10일때 멈추자
			if(i==10) {
				continue; // 다음행으로 넘어가지않고 바로 포문으로 올라옴
				//break; // 멈춤
			}
			System.out.println("========================");
		}
		System.out.println(num1 + "와 " + num2 + "사이의 모든 정수 합은" + sum + "입니다.");

	}

}
