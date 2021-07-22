package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열 배열 5개를 선언한 후 5명의 이름을 키보드 입력 받으세요
		String[] name = new String[5]; //선언
		Scanner scan = new Scanner(System.in);
		
		for (int i=0 ; i < name.length ; i++) {
			System.out.print("단어를 입력하세요 : ");
			name[i] = scan.next();
		}
		System.out.println(Arrays.toString(name));

	}

}
