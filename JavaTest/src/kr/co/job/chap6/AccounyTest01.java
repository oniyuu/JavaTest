package kr.co.job.chap6;

public class AccounyTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account obj = new Account();
		obj.accNo="123-23-2324";
		obj.name="홍길동";
		obj.balance=10000;
		
		//만원을 입금
		
		obj.deposit(10000);
		
		System.out.println("예금주명 : " + obj.name);
		System.out.println("계좌번호 : " + obj.accNo);
		System.out.println("잔액 " + obj.balance);
		
		//오천원을 출금
		try {
			obj.withdraw(25000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("여기는 무조건 거쳐간다.");
		}
		
		System.out.println("예금주명 : " + obj.name);
		System.out.println("계좌번호 : " + obj.accNo);
		System.out.println("잔액 " + obj.balance);
		
		//은행계좌 생성시 이름을 주고싶다ㅓ
		Account obj2 = new Account("장길산");
		//	obj2.name = "장길산";
		System.out.println(obj2.name);
		
		Account obj3 = new Account("임걱정", "910-3004-3156", 1000000000);
		//System.out.println(obj3.name +", "+ obj3.accNo +", "+ obj3.balance);
		printAccount(obj3);

	}
	private static void printAccount(Account obj) {
	//private static void printAccount(Object obj) {
		System.out.println(obj.name +", "+ obj.accNo +", "+ obj.balance);
	}

}
