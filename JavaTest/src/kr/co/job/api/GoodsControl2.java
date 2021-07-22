/*
 * [상품]에 상품추가, 수정, 삭제, 조회가 가능한 프로그램 작성
 * (1개의 상품만 움직입니다.)
 * 상품의 정보 : 번호, 상품명, 가격, 제조나라
 * Goods : gNo, gName, gPrice, gMade
 */
package kr.co.job.api;

import java.util.Scanner;

public class GoodsControl2 {

	public static void main(String[] args) {
		GoodsMessageimpl gc =new GoodsMessageimpl();
		Scanner scan = new Scanner(System.in);  
		Goods gd1 = new Goods();
		
		boolean result = true;
		int num;
		
		while(result) {
			num = gc.menuSelect();
			
			switch(num) {
			case 1:
				gc.goodsJoin(gd1);
				break;
				
			case 2:
				gc.goodsUpdate(gd1);
				break;
				
			case 3:
				gc.goodsDelete(gd1);
				break;
				
			case 4:
				System.out.println("상품 조회");
				System.out.println(gd1);
				break;

			case 99:
				result = false;
				break;
			}
		}
	}

}
