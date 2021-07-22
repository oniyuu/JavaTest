/*
 * 10개 배열을 생성하여 배열의 값을 0~9까지 순차적으로 초기화하고
 * 해당 배열값을 섞어보기 
 */
package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		int num=0;
		int tmp=0;
		
//		for (int i=0 ; i<numArr.length; i++) {
//			numArr[i] = i ;
////			System.out.print(numArr[i] + ", ");
////			if(i%10==9) {
////				System.out.println();
////			}
//		}
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0 ; i<100; i++) {
			num = (int) (Math.random()*numArr.length);
			tmp = numArr[0];
			numArr[0] = numArr[num];
			numArr[num] = tmp;
		}
		System.out.println(Arrays.toString(numArr));// p201 gogogo
			
	}

}
