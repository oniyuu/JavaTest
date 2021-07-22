/*
 * [상품]에 상품추가, 수정, 삭제, 조회가 가능한 프로그램 작성
 * (1개의 상품만 움직입니다.)
 * 상품의 정보 : 번호, 상품명, 가격, 제조나라
 * Goods : gNo, gName, gPrice, gMade
 */
package kr.co.job.api;

import java.util.Scanner;

public class GoodsControl {
	static Scanner scan = new Scanner(System.in); 

	public static void main(String[] args) {
		boolean result = true;
		int gno=0;
		String gname=null;
		int gprice=0;
		String gmade=null;
		Goods gd1 = new Goods(gno, gname, gprice, gmade);
		int num;
		
		while(result) {
			num = menuSelect();
			
			switch(num) {
			case 1:
				goodsJoin(gd1);
				break;
				
			case 2:
				goodsUpdate(gd1);
				break;
				
			case 3:
				goodsDelete(gd1);
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

	private static int menuSelect() {
		System.out.println("===============메 뉴===============");
		System.out.println("1.상품추가 2.수정 3.삭제 4.조회 99.종료");
		System.out.print("번호를 선택하세요 : ");
		return Integer.parseInt(scan.next());
	}

	private static void goodsDelete(Goods gd1) {
		System.out.println("상품 삭제");
		//gd1 = null;
		gd1.setgNo(0);
		gd1.setgName("0");
		gd1.setgPrice(0);
		gd1.setgMade("0");
		System.out.println(gd1);
	}

	private static void goodsUpdate(Goods gd1) {
		System.out.println("상품을 수정합니다.");
		System.out.print("수정할 번호 : ");
		int gno = Integer.parseInt(scan.next());
		gd1.setgNo(gno); 
		
		System.out.print("수정할 상품명 : ");
		String gname = scan.next();
		gd1.setgName(gname);
		
		System.out.print("수정할 가격 : ");
		int gprice = Integer.parseInt(scan.next());
		gd1.setgPrice(gprice);
		
		System.out.print("수정할 제조국 : ");
		String gmade = scan.next();
		gd1.setgMade(gmade);
		
		System.out.println("수정된 내용");
		System.out.println(gd1);
	}

	private static void goodsJoin(Goods gd1) {
		System.out.println("상품을 추가합니다.");
		System.out.print("번호 : ");
		int gno = Integer.parseInt(scan.next());
		
		System.out.print("상품명 : ");
		String gname = scan.next();
		
		System.out.print("가격 : ");
		int gprice = Integer.parseInt(scan.next());
		
		System.out.print("제조국 : ");
		String gmade = scan.next();
		
		gd1 = new Goods(gno, gname, gprice, gmade);
		System.out.println(gd1);
	}

}
