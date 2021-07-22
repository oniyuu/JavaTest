package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;	//final 고정
		String[] name = new String[SIZE];
		Scanner scan = new Scanner(System.in);
		
		// 이름 입력받기
		for (int i=0 ; i<SIZE ; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i] = scan.next();
		}
		//System.out.println(Arrays.toString(name));
		
		// 임의의 배열값 출력
		int n = (int) (Math.random()*SIZE);
		System.out.println("임의의 이름 : "+ name[n]);
	}

}
