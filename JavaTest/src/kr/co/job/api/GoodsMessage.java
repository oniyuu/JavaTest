/* 인터페이스는
 * final필드, 추상메소드로 구성됨
 */
package kr.co.job.api;

public interface GoodsMessage {
	//메뉴선택
	public int menuSelect();
	//상품추가
	public void goodsJoin(Goods obj);
	//상품수정
	public void goodsUpdate(Goods obj);
	//상품삭제
	public void goodsDelete(Goods obj);
}
