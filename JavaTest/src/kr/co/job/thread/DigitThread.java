package kr.co.job.thread;

public class DigitThread extends Thread {
	/*
	 * 0~9까지 숫자를 출력 하는 스레드 : Thread 클래스
	 * extends Thread, public void run()
	 */
	public void run() {
		System.out.println("쓰레드를 시작합니다.");
		for(int cnt=0;cnt<10;cnt++) {
			System.out.println(cnt);
		}
//		printDigit();
	}

//	private void printDigit() {
//		for(int cnt=0;cnt<10;cnt++) {
//			System.out.println(cnt);
//		}
//	}
}
