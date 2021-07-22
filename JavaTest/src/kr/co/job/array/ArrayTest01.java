package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		//[] : 배열 or 리스트 : 같은 타입의 변수를 하나의 묶음으로 다루는 것
		int[] score = new int[5];;	//int[] 배열명;
		int num[];	//c언어에서 사용하는 방법
		
		score[0] = 55;	// ~ score[4] = 11;
		//배열에 랜덤으로 1~100까지 수를 대입하기.
		
		for (int i=0 ; i<score.length ; i++) {
			score[i] = (int) (Math.random()*100+1);
		}
		
		for (int i=0 ; i<score.length ; i++) {
			System.out.println("score["+i+"]="+score[i]);
		}
		System.out.println(Arrays.toString(score));
		

	}

}
