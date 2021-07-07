/*
 * 실행문1
 * while(조건){
 * 		실행문2 => 조건이 참이면 실행 됨.
 */

package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		int i=1, sum=0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i);
			i++;
		}
		System.out.println("sum = " + sum);
	}

}
