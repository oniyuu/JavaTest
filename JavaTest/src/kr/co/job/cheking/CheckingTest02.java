/*
 * 두 수를 키보드로 입력 받아서
 * 두 수의 값을 서로 교환 하자
 * 
 */
package kr.co.job.cheking;

import java.util.Scanner;

public class CheckingTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int num1=0, num2=0, num3=0;
		
		System.out.print("Intput first number : ");
		num1 = scan.nextInt();
		System.out.print("Intput second number : ");
		num2 = scan.nextInt();
		
		System.out.println();
		System.out.printf("first number : %d, second number : %d%n",num1, num2);
		System.out.println();
		System.out.println("Change!!!");
		System.out.println();
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.printf("first number : %d, second number : %d%n",num1, num2);

	}

}
