package kr.co.job.oper;

public class ForTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("===== 줄칸 또는 행렬 에 대하여 =====");
//		for(int i=1; i<=4; i++) { // i : 줄
//			for(int j=1; j<=i; j++) { // j : 별 갯수
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 난수 발생 : Math.random() - 0 ~ 0.9999의 임의의 수를 하나 발생시킴
//		System.out.println(Math.random());
//		System.out.println(Math.random());
//		System.out.println(Math.random());
		
		int num = 0;
//		num = (int) (Math.random()*10); // 0 ~ 9
//		System.out.println(num);
//		
//		// 1 ~ 10 사이의 수 발생
//		num = (int) (Math.random()*10) + 1;
//		System.out.println(num);
//		
//		// 1~45 사이의 수 발 생
//		for(int i=1;i<=10;i++) {
//			num = (int) (Math.random()*45) + 1;
//			System.out.println(num);
//		}
		
		// 11~13 사이의 수 발생
		for(int i=1;i<=10;i++) {
			num = (int) (Math.random()*3) + 11; // (int) (Math.random()*갯수) + 시작값;
			System.out.println(num);
		}


	}

}
