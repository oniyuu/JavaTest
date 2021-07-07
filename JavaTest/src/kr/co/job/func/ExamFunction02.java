/*
 * 두 수를 입력 받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드
 * void plusV(int n1, int n2);
 * minusV(), mulV(), divV() => 메소드 이름
 */

package kr.co.job.func;

public class ExamFunction02 {

	public static void main(String[] args) {
		//
		
		int sum = plusV(3,5);
		System.out.println(sum);
		minusV(3,10);
		mulv(5,4);
		divV(2,8);

	}

	private static void divV(double n1, double n2) {
		// 2, 8의 나눗셈
		System.out.println(n1+"/"+n2+"="+n1/n2);
		
	}

	private static void mulv(int n1, int n2) {
		// 5, 4의 곱셈
		System.out.println(n1+"*"+n2+"="+n1*n2);
		
	}

	private static void minusV(int n1, int n2) {
		// 3, 10의 뺄셈
		System.out.println(n1+"-"+n2+"="+(n1-n2));
		
	}

	private static int plusV(int n1, int n2) {
		// 3, 5의 합 구하기
		//System.out.println(n1+"+"+n2+"="+n1+n2);
		return n1+n2;
	}

}
