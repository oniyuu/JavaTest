package kr.co.job.oper;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, sum = 0;
		while(true) {
			sum += i ;
			i++;
			if (i==11) {
				break;
			}
		}
		System.out.println("sum = " + sum);
		
	}

}
