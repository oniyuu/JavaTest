package kr.co.job.chap6;

//class Tv {
//	String color;
//	boolean power;
//	int channel;
//	
//	void power() {
//		power = !power;
//	}
//	void channelUp() {
//		++channel;
//	}
//	void channelDown() {
//		--channel;
//	}
//}
//
//class TvTest2 {
//	public static void main(String[] args) {
////		Tv t;
////		t = new Tv();
////		t.channel = 7;
////		t.channelDown();
////		System.out.println("ch : " + t.channel);
////		System.out.println(t.power);
//		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		System.out.println("t1 ch : " + t1.channel);
//		System.out.println("t2 ch : " + t2.channel);
//		
//		t1.channel = 7;
//		System.out.println("t1 ch : " + t1.channel);
//		System.out.println("t2 ch : " + t2.channel);		
//		}
//	}
//}

class TvTest2 {
	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];	//길이가 3인 Tv객체 배열
		
		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for(int i=0 ; i < tvArr.length ; i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i+10; // tvArr[i]의 channel에 i+10을 저장 
			tvArr[i].power = !tvArr[0].power;
		}
		
		for(int i=0 ; i < tvArr.length ; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
			System.out.printf("tvArr[%d].color=%s%n", i, tvArr[i].color);
			System.out.printf("tvArr[%d].power=%s%n", i, tvArr[i].power);
		}
	}
}

class Tv {
	String color;		//색상
	boolean power;		//전원상태(on/off)
	int channel;		//채널
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}