package kr.co.job.exec;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//4-1
		//1
//		int x=0;
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		x = scan.nextInt();
//		
//		if(x>10 && x<20) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//2
//		char ch ='a';
//
//		if( !(ch == ' ' || ch == '\t') ) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//3
//		char ch = 'a';
//		
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//4
//		char ch = '1';
//		
//		if(ch >='0' && ch <= '9') {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//5
//		char ch = 'B';
//		
//		if((ch >='A' && ch <='Z') || (ch >='a' && ch <='z')) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		//6
//		int year=500;
//		
//		if(year%400 == 0 || (year%4 == 0 && year%100 != 0 )) {	//if(year%4 == 0) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");	
//		}
		
		//7
//		boolean powerOn = true;
//		
//		if (powerOn == false) {		//!powerOn
//			System.out.println("true");
//		} else {
//			System.out.println("false");	
//		}
		
		//8
//		String str="no";
//		
//		if (str == "yes") {		//str.equals("yes")
//			System.out.println("true");
//		} else {
//			System.out.println("false");	
//		}
		
		//4-2
//		int sum=0;
//		
//		for (int i=1 ; i <=20 ; i++) {
//			if (!(i%2 == 0 || i%3 == 0)) {	// i%2 != 0 && i%3 != 0
//				sum += i;
//			} 
//		}
//		System.out.println("1~20까지 2또는3의 배수가 아닌 수의 합 : " + sum);
		
		//4-3
//		int sum1=0, sum2=0;
//		
//		for (int i=1; i<=10 ; i++) {
//			sum1 += i;
//			sum2 += sum1;
//		}
//		System.out.println(sum2);
		
		//4-4
//		int i=0, sum=0;
//		
//		while (sum<100) {
//			i++;
//			if(i%2==1) {
//				sum += i;
//			} else {
//				sum -= i;
//			}
//		}
//		
//		System.out.println("1~" + i + "까지 총합 : " + sum);
//		System.out.println("1부터 " + i + "까지 더 했을 때 100이 넘습니다.");
		
		//4-5
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		int i=0;
//		
//		while( i <= 10) {
//			int j =0;
//			while( j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//4-6
//		int dice=8, result=8;
//		for (int i=1 ; i <=dice ; i++ ) {	//i 주사위1
//			for (int j=1 ; j <=dice ; j++) {	//j 주사위2
//				if (i+j == result) {
//					System.out.println(i + ", " +j);
//				}
//			}
//		}
		
		//4-7
//		int value = (int) (Math.random()*6)+1;
//		System.out.println("value:"+value);
		
		//4-8
//		for(int i=0 ; i<=10; i++) {
//			for(int j=0 ; j<=10; j++) {
//				if(2*i + 4*j == 10) {
//					System.out.println("x="+ i +" y=" + j);
//				}
//			}	
//		}
		
		//4-9
//		String str = "12345";
//		int sum = 0;
//		System.out.println("str문자열의 길이 : " + str.length());
//		String s="hello";
//		String s2= s.concat("world");
//		System.out.println(s2);
//		
//		for (int i = 0; i < str.length(); i++) {
//			sum += str.charAt(i)-48;
//		}
//		System.out.println("sum="+sum);
		
		//4-10
//		int num = 12345, num1=0;
//		int sum = 0;
//		
//		num1=num;
//		
//		while (num1%10 !=0) {
//			sum += num1%10;
//			num1 = num1/10;
//		}
//		System.out.println("num="+num+", sum="+sum);
		
		//4-11
//		int num1=1, num2=1, num3=0;
//		System.out.print(num1+", "+num2);
//		
//		for(int i=0; i<8; i++) {
//			num3= num1 + num2;
//			System.out.print(", "+num3);
//			num1= num2;
//			num2= num3;
//		}
		
		//4-12 ?
//		for (int i=2; i<=9; i++) {
//			for (int j=1; j<=3; j++) {
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//			System.out.println();
//		}
		
		//4-13
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		
//		//반복문과 charAt (int i) 를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
//		for(int i = 0; i<value.length() ; i++) {
//			ch = value.charAt(i);
//			if(ch < '0' || ch > '9' ) {
//				isNumber = false;
//			}
//		}
//		if (isNumber) {
//			System.out.println(value+"는 숫자입니다.");
//			} else {
//			System.out.println(value+"는 숫자가 아닙니다.");
//			}
		
		//4-14
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
//		int answer = (int) (Math.random()*100) + 1;
//		int input = 0;	//사용자입력을 저장할 공간
//		int count = 0;	//시도 횟수를 세기위한 변수
//		
//		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//		Scanner s = new Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 : ");
//			input = s.nextInt();	//입력받은 값을 변수 input에 저장한다.
//			
//			if (input < answer) {
//				System.out.println("더 큰 수를 입력하세요.");
//			} else if (input > answer) {
//				System.out.println("더 작은 수를 입력하세요.");
//			} else if (input == answer) {
//				System.out.println("맞췄습니다.");
//				System.out.println("시도횟수는 "+count+"번입니다.");
//				break;
//			}
//		} while(true); // 무한반복문
		
		//4-15
//		int number = 12321;
//		int tmp = number;
//		
//		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
//
//		while(tmp !=0) {
//			result = result*10 + tmp%10;
//			tmp = tmp/10;
//			System.out.println(tmp + "," + result);
//		}
//		
//		if (number == result)
//			System.out.println( number + "는 회문수 입니다.");
//		else
//			System.out.println( number + "는 회문수가 아닙니다.");
		
		int number = 12321;
		//String str1 =""+number;
		//String str2 = new StringBuilder(str1).reverse().toString();
		String str1 = Integer.toString(number);
		String str2 = "";
		
		for (int i = str1.length()-1; i>=0;i--) {
			str2+=str1.charAt(i);
			System.out.println(str2);
		}
		
		if (str1.equals(str2)) {
			System.out.println( number + "는 회문수 입니다.");
		} else {
			System.out.println( number + "는 회문수가 아닙니다.");
		}
	}

}
