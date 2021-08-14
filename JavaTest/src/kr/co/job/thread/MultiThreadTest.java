package kr.co.job.thread;

public class MultiThreadTest {
	public static void main(String[] args) {
		DigitThread t1 = new DigitThread();
		DigitThread t2 = new DigitThread();
		
		t1.start(); //쓰레드 실행
		t2.start(); //쓰레드 실행
		
		for(char ch='A'; ch<='Z';ch++) {
			System.out.println(ch);
		}
		
		DigitThread2 obj = new DigitThread2();
		Thread t3 = new Thread(obj);	//onj를 t3 인스턴스화
		t3.start();
	}
}
