package kr.co.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class lotto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Integer> num1 = new ArrayList<Integer>();
		List<Integer> num2 = new ArrayList<Integer>();
		List<Integer> num3 = new ArrayList<Integer>();
		List<Integer> num4 = new ArrayList<Integer>();
		List<Integer> num5 = new ArrayList<Integer>();
		List<Integer> num11 = new ArrayList<Integer>();
		List<Integer> num22 = new ArrayList<Integer>();
		List<Integer> num33 = new ArrayList<Integer>();
		List<Integer> num44 = new ArrayList<Integer>();
		List<Integer> num55 = new ArrayList<Integer>();
		List<Integer> lotto = new ArrayList<Integer>();
		int overlap;

		//int outnum = 0; 

		boolean result = true;
		
		// 1부터 45까지 생성
		// 버튼을 만들어서 제외수 하나씩 주석 처리
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		num1.add(6);
		num1.add(7);
		num1.add(8);
		num1.add(9);
		num2.add(10);
		num2.add(11);
		num2.add(12);
		num2.add(13);
		num2.add(14);
		num2.add(15);
		num2.add(16);
		num2.add(17);
		num2.add(18);
		num2.add(19);
		num3.add(20);
		num3.add(21);
		num3.add(22);
		num3.add(23);
		num3.add(24);
		num3.add(25);
		num3.add(26);
		num3.add(27);
		num3.add(28);
		num3.add(29);
		num4.add(30);
		num4.add(31);
		num4.add(32);
		num4.add(33);
		num4.add(34);
		num4.add(35);
		num4.add(36);
		num4.add(37);
		num4.add(38);
		num4.add(39);
		num5.add(40);
		num5.add(41);
		num5.add(42);
		num5.add(43);
		num5.add(44);
		num5.add(45);
		
		//각 배열별로 순서섞기
		Collections.shuffle(num1);
		Collections.shuffle(num2);
		Collections.shuffle(num3);
		Collections.shuffle(num4);
		Collections.shuffle(num5);
		
		
		// 10의 자리 중복 허용 수
		// 새로운 배열을 만들어 기존배열에서 사용할 수 있는 자릿수 만큼 선택
		while(result) {
			System.out.print("자릿수 중복 허용 수 (2~6): ");
			overlap = scan.nextInt();
			
			if (overlap<2 && overlap>6) {
				System.out.println("다시 입력해주세요");
				continue;
			} else {
				for (int i=0 ; i<overlap ; i++) {
					num11.add(num1.get(i));
					num22.add(num2.get(i));
					num33.add(num3.get(i));
					num44.add(num4.get(i));
					num55.add(num5.get(i));
				}
				result = false;
			}
				
		}
		
		//합치기
		lotto.addAll(num11);
		lotto.addAll(num22);
		lotto.addAll(num33);
		lotto.addAll(num44);
		lotto.addAll(num55);
		
		//순서 섞기
		Collections.shuffle(lotto);

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
		
//		//모두 짝수와 모두 홀수가 아닐 때 
//		for(int i=0; i<6; i++) {
//			// 중복 번호 제거
//			for(int j=0; j<i; j++) {
//				if((num.get(i)/2==0) && (num.get(j)/2==0) || (num.get(i)/2==1) && (num.get(j)/2==1)) {
//					i--;
//					break;	
//				}
//			}
//		}
		
		//0~부터 5까지 나열
		System.out.print(lotto.get(0));
		for (int i=1 ; i<6 ; i++) {
			System.out.print(", "+lotto.get(i));
		}
		System.out.println();
		
	}
}
