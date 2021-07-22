package kr.co.job.api;

import java.util.Scanner;

public class GoodsMessageimpl implements GoodsMessage{
	Scanner scan = new Scanner(System.in);

	@Override
	public int menuSelect() {
		System.out.println("===============메 뉴===============");
		System.out.println("1.상품추가 2.수정 3.삭제 4.조회 99.종료");
		System.out.print("번호를 선택하세요 : ");
		return Integer.parseInt(scan.next());
	}

	@Override
	public void goodsJoin(Goods obj) {
		System.out.println("상품을 추가합니다.");
		System.out.print("번호 : ");
		int gno = Integer.parseInt(scan.next());
		obj.setgNo(gno);
		
		System.out.print("상품명 : ");
		String gname = scan.next();
		obj.setgName(gname);
		
		System.out.print("가격 : ");
		int gprice = Integer.parseInt(scan.next());
		obj.setgPrice(gprice);
		
		System.out.print("제조국 : ");
		String gmade = scan.next();
		obj.setgMade(gmade);
		
		System.out.println(obj);
		
	}

	@Override
	public void goodsUpdate(Goods obj) {
		System.out.println("상품을 수정합니다.");
		System.out.print("수정할 번호 : ");
		int gno = Integer.parseInt(scan.next());
		obj.setgNo(gno); 
		
		System.out.print("수정할 상품명 : ");
		String gname = scan.next();
		obj.setgName(gname);
		
		System.out.print("수정할 가격 : ");
		int gprice = Integer.parseInt(scan.next());
		obj.setgPrice(gprice);
		
		System.out.print("수정할 제조국 : ");
		String gmade = scan.next();
		obj.setgMade(gmade);
		
		System.out.println("수정된 내용");
		System.out.println(obj);
		
	}

	@Override
	public void goodsDelete(Goods obj) {
		System.out.println("상품 삭제");
		obj.setgNo(0);
		obj.setgName("0");
		obj.setgPrice(0);
		obj.setgMade("0");
		System.out.println(obj);
		
	}

}
