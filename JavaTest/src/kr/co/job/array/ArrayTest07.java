package kr.co.job.array;

public class ArrayTest07 {

	public static void main(String[] args) {
		// 2차원 배열을 이해하자
		int[][] score = {
				//국어,영어,수학
				{100,100,100},	//[0,1][0,2][0,3]
				{20,20,20},		//[1,1][1,2][1,3]
				{30,30,30},		//[2,1][2,2][2,3]
				{40,40,40},		//[3,1][3,2][3,3]
				{50,50,50}		//[4,1][4,2][4,3]
		};
		int korSum = 0;
		int engSum = 0;
		int matSum = 0;
		
		// i:행(줄)-학생  j:열(칸)-점수
		for (int i=0 ; i<score.length;i++) { // score.length => 5 (행의길이)
			System.out.println(i+"행");
			for(int j=0 ; j<score[i] .length ; j++) {
				System.out.print("score["+i+"]["+j+"]=" + score[i][j]+"  ");
			}
			System.out.println();
		}
		
		for(int i=0 ; i < score.length ; i++) {
			korSum += score[i][0];
			engSum += score[i][1];
			matSum += score[i][2];
		}
		
		System.out.println("국어 점수 합 : " + korSum + ", 평균 : " + korSum/score[0].length);
		System.out.println("영어 점수 합 : " + engSum + ", 평균 : " + engSum/score[1].length);
		System.out.println("수학 점수 합 : " + matSum + ", 평균 : " + matSum/score[2].length);

	}

}
