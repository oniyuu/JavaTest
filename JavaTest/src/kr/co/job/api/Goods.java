package kr.co.job.api;

public class Goods {
	private int gNo;
	private String gName;
	private int gPrice;
	private String gMade;
	
	public Goods() {
	}
	
	public Goods(int gNo, String gName, int gPrice, String gMade) {
		super();
		this.gNo = gNo;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gMade = gMade;
	}

	public int getgNo() {
		return gNo;
	}

	public void setgNo(int gNo) {
		this.gNo = gNo;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

	public String getgMade() {
		return gMade;
	}

	public void setgMade(String gMade) {
		this.gMade = gMade;
	}

	@Override
	public String toString() {
		return "상품 [번호=" + gNo + ", 상품명=" + gName + ", 가격=" + gPrice + ", 제조국=" + gMade + "]";
	}
	
}
