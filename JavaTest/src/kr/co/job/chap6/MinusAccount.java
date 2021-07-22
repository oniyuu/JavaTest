/*
 * 마이너스한도, 인출한다를 수정해야함.
 */
package kr.co.job.chap6;

public class MinusAccount extends Account {
	int creditLine;

	public MinusAccount(String name, String accNo, int balance, int creditLine) {
		super(name,accNo,balance);
		this.creditLine = creditLine;
	}
	
	// 인출한다를 수정함 => 메소드 오버라이딩
	@Override
	int withdraw(int amount) {
		if((balance + creditLine) < amount) {
			return 0;
		}
			balance -= amount;
			return amount;
	}

}
