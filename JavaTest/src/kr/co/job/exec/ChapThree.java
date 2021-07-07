package kr.co.job.exec;

public class ChapThree {

	public static void main(String[] args) {
		// 3-1
//		int x = 2;
//		int y = 5;
//		char c = 'A'; // 'A'의 문자코드는 65
//		
//		System.out.println(1 + x << 33);// (1+2) * 2 = 6
//		System.out.println(y >= 5 || x < 0 && x >2);// (5 >= 5) or (2 < 0 & 2 > 2), 참
//		System.out.println(y += 10 - x++);// 5+10-2 = 13, x=2+1=3
//		System.out.println(x+=2);//x=3+2=5
//		System.out.println( !('A' <= c && c <='Z'));// !(65<=65 & 65<=90), 거짓
//		System.out.println('C'-c);//C-A=67-65=2
//		System.out.println('5'-'0');//53-48=5
//		System.out.println(c+1);//A+1=65+1=66
//		System.out.println(++c);//c=1+A=B
//		System.out.println(c++);//c=B, B+1, c=C
//		System.out.println(c);//c=C
		
		// 3-2
//		int numOfApples = 123; // 사과의 개수
//		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
//		int numOfBucket = (numOfApples - numOfApples%sizeOfBucket)/sizeOfBucket + (numOfApples%sizeOfBucket==0 ? 0 : 1); // 모든 사과를 담는데 필요한 바구니의 수 
//		
//		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		
		// 3-3
//		int num = 10;
//		System.out.println( num>0 ? "양수" : num<0 ? "음수" : "0");

		// 3-4
//		int num = 456;
//		System.out.println(num - num%100);
		
		// 3-5
//		int num = 333;
//		System.out.println(num - num%10 + 1);
		
		// 3-6
//		int num = 24;
//		System.out.println(10 - num%10);
		
		// 3-7
		int fahrenheit = 100;
		float celcius = 5f/9*(fahrenheit-32);
		//double celcius = Math.round(5f/9*(fahrenheit-32)*100)/100.0;
		
		System.out.println("fahrenheit:"+fahrenheit);
		System.out.println("celcius:"+celcius);
		
		// 3-8
//		byte a = 10;
//		byte b = 20;
//		int c = a + b;
//		
//		char ch = 'A';
//		ch = (char) (ch+2);
//		
//		float f = 3.0f / 2;
//		long l = 3000 * 3000 * 3000L;
//		
//		float f2 = 0.1f;
//		double d = (float)0.1;
//		
//		boolean result = d==f2;
//		
//		System.out.println("c="+c);
//		System.out.println("ch="+ch);
//		System.out.println("f="+f);
//		System.out.println("l="+l);
//		System.out.println("result="+result);
		
		// 3-9
//		char ch  = 'z';
//		boolean b = (ch >= 48 && ch <= 57 || ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122);
//		System.out.println(b);
		
		// 3-10
//		char ch = 'A';
//		
//		char lowerCase = ch >= 65 && ch <= 90 ? lowerCase=(char) (ch+32) : ch ;
//		
//		System.out.println("ch:"+ch);
//		System.out.println("ch to lowerCase:"+lowerCase);
		
	}

}
