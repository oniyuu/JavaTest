package kr.co.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> num = new ArrayList<Integer>();

		int outnum = 0; 


		boolean result = true;
		
		// 1부터 45까지 생성
		for(int i=1 ; i<=45 ; i++) {
			num.add(i);
		}
		
		//제외수
		System.out.print("제외할 숫자는 몇개 입니까?(0~38) : ");
		outnum = scan.nextInt();
		
		while (result) {
			for(int i=0 ; i<outnum ; i++) {//n : 선택수 제외
				System.out.print("제외수를 입력하세요(1~45) : ");
				num.remove(Integer.valueOf(scan.nextInt()));				
			}
			result = false;
		}
		
		//순서 섞기
		Collections.shuffle(num);

//		//모두 짝수가 아닐 때
//		for(int i=0; i<6; i++) {
//			// 중복 번호 제거
//			for(int j=0; j<i; j++) {
//				if((num.get(i)/2==0) && (num.get(j)/2==0)) {
//					i--;
//					break;	
//				}
//			}
//		}
//		
//		//모두 홀수가 아닐 때 
//		for(int i=0; i<6; i++) {
//			// 중복 번호 제거
//			for(int j=0; j<i; j++) {
//				if((num.get(i)/2==1) && (num.get(j)/2==1)) {
//					i--;
//					break;	
//				}
//			}
//		}
		
		//모두 짝수와 모두 홀수가 아닐 때 
		for(int i=0; i<6; i++) {
			// 중복 번호 제거
			for(int j=0; j<i; j++) {
				if((num.get(i)/2==0) && (num.get(j)/2==0) || (num.get(i)/2==1) && (num.get(j)/2==1)) {
					i--;
					break;	
				}
			}
		}
		
		//0~부터 5까지 나열
		System.out.print(num.get(0));
		for (int i=1 ; i<6 ; i++) {
			System.out.print(", "+num.get(i));
		}
		System.out.println();
		
	}
}
