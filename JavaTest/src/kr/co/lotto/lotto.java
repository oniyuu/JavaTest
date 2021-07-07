package kr.co.lotto;

import java.util.Arrays;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[6];
		
		//랜덤숫자 5개
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = (int) (Math.random()*45)+1;
			for (int j=0 ; j<i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}

		//정렬
		Arrays.sort(arr);
		
		//출력
		if (!(arr[0]/2==0 && arr[1]/2==0 && arr[2]/2==0&&arr[3]/2==0&&arr[4]/2==0&&arr[5]/2==0)||!(arr[0]/2==1&&arr[1]/2==1&&arr[2]/2==1&&arr[3]/2==1&&arr[4]/2==1&&arr[5]/2==1)) {
			System.out.println(Arrays.toString(arr));
		}

		

	}

}
