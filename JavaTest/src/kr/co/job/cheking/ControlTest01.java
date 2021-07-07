/*
 * 프로그램의 기본 흐름 구조 설계하기
 * ==== 메뉴 ====
 * 1.두 수의 합  2.구구단  3.입력받은 수 까지의 합  99.종료
 * =============
 * select number :
 * 
 */
package kr.co.job.cheking;

import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		
		while(done) {
			System.out.println("==== [ menu ] ====");
			System.out.println("1.두 수의 합  2.구구단  3.입력받은 수 까지의 합  99.종료");
			System.out.print("숫자를 입력 하세요 : ");
			num = scan.nextInt();
			
			switch(num) {
			case 1:
				int num1=0, num2=0, sum1=0;
				System.out.print("첫번째 숫자를 입력하세요 : ");
				num1 = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 : ");
				num2 = scan.nextInt();
				System.out.println();
				sum1 = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + sum1);
				System.out.println();
				break;
				
			case 2:
				for (int i=2 ; i<=9 ; i++) {
					for (int j=1 ; j<=9 ; j++) {
						System.out.println(i + " x " + j + " = " + i*j);
					}
					System.out.println();
				}
				break;
				
			case 3:
				int num3=0, num4=0, min=0, max=0, sum2=0;
				System.out.print("첫번째 숫자를 입력하세요 : ");
				num3 = scan.nextInt();
				System.out.print("두번째 숫자를 입력하세요 : ");
				num4 = scan.nextInt();
				
				if (num3>num4) {
					max = num3;
					min = num4;
				} else {
					max = num4;
					min = num3;
				}
				for ( int i=min ; i<=max ; i++ ) {
					sum2 += i;
				}
				System.out.println();
				System.out.println(min + "부터 " + max + "까지 숫자의 합 : " + sum2);
				System.out.println();
				break;
				
			case 99:
				System.out.println();
				System.out.println("종료");
				done = false;
				break;
					
			default :
				System.out.println("숫자를 잘 못 입력하였습니다.");
				System.out.println();
				continue;
			}
			
		}

	}

}
