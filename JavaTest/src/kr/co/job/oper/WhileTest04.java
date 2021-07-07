package kr.co.job.oper;

public class WhileTest04 {

	public static void main(String[] args) {
		/*
		 * While 문과 Math.random() 메소드를 이용
		 * 1~6의 눈을 갖는 두 개의 주사위를 던졌을 때
		 * 주사위 눈의 값을 (1주사위눈, 2주사위눈) 형태로 출력하고
		 * 두 개의 눈이 서로 다른 값이면 계속 주사위를 던지고
		 * 두 개의 눈이 같으면 멈추는 코드 작성
		 */
		int dice1=0, dice2=0;
		boolean result = true;
		
		//while( dice1 - dice2 != 0 ) {
		while( result ) {
			dice1 = (int) (Math.random()*6) + 1;
			dice2 = (int) (Math.random()*6) + 1;
			System.out.printf("%d, %d%n", dice1, dice2);
			
			if (dice1-dice2 == 0) {
				System.out.println("두 주사위의 눈이 같습니다.");
				result = false;
			}
		}
		System.out.println("end");

	}

}
