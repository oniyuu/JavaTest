/* 직불카드계좌 클래스
 * [속성]
 * 계좌번호, 예금주명, 잔액, 카드번호
 * 
 * [메소드]
 * 예금한다. 인출한다. 지불한다.
 */
package kr.co.job.chap6;

public class CheckingAccount extends Account {
	//카드번호, 지불한다
	String cardNo;
	
	//생성자
	public CheckingAccount() {
		
	}
	
	public CheckingAccount(String name, String accNo, int balance, String cardNo) {
//		this.name = name;
//		this.accNo = accNo;
//		this.balance = balance;
		super(name,accNo,balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo) || (balance < amount)) {
			return 0;
		}
		return withdraw(amount);
	}

}
