/*
 * 은행계좌 클래스
 * - 속성(field) : 계좌번호, 예금주, 잔액
 * - 기능(Method) : 입금한다, 출금한다.
 * 
 * 클래스의 속성(데이터)만 정의
 * -> bean Class , VO, DTO(웹)
 * 
 * - 클래스 : 속성 과 메소드 그리고 생성자로 구성됨
 * 
 * - 클래스의 캡슐화(은닉) : private Goods Class
 * - 클래스의 상속(다중상속안됨)
 * - 메소드의 오버라이딩
 *    : 상속받은 메소드를 변경하는것 
 * 
 * Account obj = new Account();  //객체생성 , 인스턴스화 라고 부름 
 * 
 * 생성자 : 모든 클래스는 하나의 생성자가 필요함.
 * 클래스에서 정의하지 않으면 기본생성자(디폴트생성자)가 자동 발생.
 * 인스턴스시 필드의 값(속성)을 초기화하는 작업이 필요할 때 생성자 작성
 * ==> 매개변수 생성자.
 */
package kr.co.job.chap6;

public class Account {
//public abstract class Account { => 객체생성불가
	// 클래스의 속성(데이터)만 정의 -> bean Class, VO, DTO(웹)
	// 다른 패키지로 이동 시킬 경우 변수 앞에 public을 붙여준다
	String accNo;
	String name;
	int balance; //잔고
//	public String accNo;
//	public String name;
//	public int balance; //잔고
	
	//생성자
	Account(){}	// 디폴트 생성자
	
	//생성시 이름
	Account(String name) {
		this.name = name;
	}
	
	//생성시 이름과 계좌번호
	Account(String name, String accNo) {
//		this.name = name;
		this(name);	// 위에 이미 만들어져서 해당 함수로 사용 가능
		this.accNo = accNo;
	}
	
	Account(String name, String accNo, int balance) {
//		this.name = name;
//		this.accNo = accNo;
		this(name,accNo); // 첫줄에 this()사용해야함
		this.balance = balance;
	}

	void deposit(int amount) { //예금한다.
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception { //출금한다.
		if(balance<amount) {
			//return 0; //잔액이 부족하면 0을 리턴
			throw new Exception("잔액이 부족합니다."); // 예외를발생시키기 "잔액이 부족합니다." 상단에 throws Exception 추가
		}
		balance -= amount;
		return amount;
	}
	
//	public void deposit(int amount) { //예금한다.
//		balance += amount;
//	}
//	
//	public int withdraw(int amount) { //출금한다.
//		if(balance<amount)
//			return 0; //잔액이 부족하면 0을 리턴
//		balance -= amount;
//		return amount;
//	}
	
//	public final void deposit(int amount) { //예금한다.
//	balance += amount;
//}
//
//	public final int withdraw(int amount) { //출금한다.
//	if(balance<amount)
//		return 0; //잔액이 부족하면 0을 리턴
//	balance -= amount;
//	return amount;
//}
	
//	abstract void test(int n);
	
}