/*
 * 다양한 for문들
 * 1. 시작값 끝값까지 입력받아 모든 홀수의 합
 * 2. 1+2+3...+10 = 55 출력해보기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		//선언
//		Scanner scan = new Scanner(System.in);
//		int startValue, lastValue;
//		
//		System.out.print("시작값 입력 : ");
//		startValue = scan.nextInt();
//		
//		System.out.print("끝값 입력 : ");
//		lastValue = scan.nextInt();
//		
//		//처리
//		for(int i=startValue; i<=lastValue; i++) {
//			if (i%2 == 1) { // i%2 != 0
//				System.out.println(i + " ");
//			}
//		}
//		
//		System.out.println("========================");
		
//		int sum=0; 
//		for(int i=1; i<=10; i++) {
//			sum += i;
//			System.out.print(i);
//			if (i != 10) {
//				System.out.print("+");				
//			} else {
//				System.out.print("=");
//			}
//		}
//		System.out.println(sum);
		
		Scanner scan = new Scanner(System.in);
		int num1, num2, min, max, sum = 0;
		
		System.out.print("첫번째 수를 입력하세요 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		num2 = scan.nextInt();

		if (num1>num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		System.out.print("계산식 : ");	
		for(int i=min ; i<=max ; i++) {
			if (i%2 != 0) {
				sum += i;
				System.out.print(i);
				if (i+1 == max) {
					System.out.print("");
				} else if (i != max) {
					System.out.print("+");
				} else {
					System.out.print("");			
				}
			} else {
				continue;
			}
		}

		System.out.println("=" + sum);		
		System.out.println(min + "부터 " + max + "까지 홀 수 의 합 : " + sum);
	}

}
