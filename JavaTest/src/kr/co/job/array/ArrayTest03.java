package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		//
		int[] score = {55,88,96,100,90,85,75,11,5};
		int sum=0, min=score[0], max=score[0];
		float avg = 0f;
		//해당 배열에서 최대값과 최소값을 구하세요.
		
		for (int i=0 ; i<score.length ; i++ ) {
			if (score[i]>max) {
				max = score[i];
			}
			if (score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

		//합구하기
//		for (int i=0 ; i<score.length ; i++) {
//			sum += score[i];
//		}
//		
//		avg = (float)sum/score.length;
//		
//		//평균
//		
//		System.out.println("총점 : " + sum);
//		System.out.println("평균 : " + avg);

	}

}
