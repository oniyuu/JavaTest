package kr.co.job.thread;

public class DigitThread2 implements Runnable {

	@Override
	public void run() {
		for(int cnt=0;cnt<10;cnt++) {
			System.out.println(cnt);
		}
		
	}

}
