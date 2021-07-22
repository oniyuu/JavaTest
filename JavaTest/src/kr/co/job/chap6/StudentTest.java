package kr.co.job.chap6;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu; // 선언
		stu = new Student("홍길동","컴공","20210503",21);	//인스턴스화
		
		System.out.println(stu);	//해당 객체 출력
		//컴공 -> 미대
		//stu.major = "미대";
		stu.setMajor("미대");
		System.out.println("당신의 학과 : " + stu.getMajor());
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		System.out.println("1초 후 출력됨.");
		
	}
}
