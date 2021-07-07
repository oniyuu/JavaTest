/*
 * 기본적인 for문
 * for(초기값; 조건; 증감치){
 * 실행문
 * }
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		for(i=1; i<9; i++) {
//			System.out.println("반복변수 i값 : " + i);
//		}
//		System.out.println("for문 종료 후 반복변수 i값 : " + i);
		
		int i = 0, sum = 0; 
		for(i=1; i<=10; i++) {
			sum = sum +i;
			System.out.println("i=" + i + "일 때 sum = " + sum);
		}


	}

}
