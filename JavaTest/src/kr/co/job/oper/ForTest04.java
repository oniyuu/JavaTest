package kr.co.job.oper;

public class ForTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		//1회 실행
		for(dan=2;dan<=9;dan++) {
			//8회
			for(int i=1;i<=9;i++) {
				// 8 * 9 회
				System.out.println(dan + "x" + i + "=" + dan*i );
			}
			// 8회
		}
		//1회

	}

}
