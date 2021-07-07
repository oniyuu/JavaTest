package kr.co.job.func;

import java.util.Scanner;

public class ExamFunction03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 두 수를 키보드로 입력 받아서 합 메소드에 결과 값을 받아 출력 하기
		int sum=0, n1=0, n2=0;
		
		System.out.print("first number : ");
		n1 = scan.nextInt();
		System.out.print("second number : ");
		n2 = scan.nextInt();
		
		sum = sumTwo(n1,n2);
		System.out.println("result : "+sum);
	}
	
	static int sumTwo(int n1, int n2) {
		return n1+n2;
	}

}
