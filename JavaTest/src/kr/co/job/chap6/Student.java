/* 모델링 (틀) : 재사용성, 용이성, 상속성-확장, 다형성, 캡슐화, 정보은닉
 * 
 * [클래스의 다형성]
 * - List => ArrayList, LinkedList
 * ArrayList list = new ArrayList();
 * List list2 = new ArrayList();
 * 
 * 학생 클래스 	=> Student
 * [속성, 멤버변수, 필드]
 * 학생명, 학과, 학번, 나이
 * [생성자]
 * 
 * Bean Class, VO, DTO
 * [메소드]
 * 
 * 오버라이딩-> 부모클래스 메소드 변경함
 * 오버로딩 -> 메소드 이름 같은 것, 매개 변수는 틀림
 * add(a,b)
 * add(a,b,c)
 * 
 * 생성자,매개변수 생성자 : 속성을 초기화 함.
 * this - 자기자신의 필드
 * this() - 자신의 생성자
 * 
 * super
 * 
 */
package kr.co.job.chap6;

public class Student {
	//클래스 변수
	static int cnt;	//static 필드
	// 사용시 Student.cnt obj.cnt
	
	//필드
	private String name;
	private String major;
	private String sNo;
	private int age;
	
	//public 전체
	//protected 동일패키지에 있거나 상속 관계에 잇는 하위 클래스
	//package(디폴트) 패키지내
	//private 클래스내
	
	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//생성자
	public Student() {
		cnt++;	// 학생수 증가
		System.out.println("학생생성");
	}
	
	public Student(String name, String major, String sNo) {
		super();	//뜻을 찾아보자
		this.name = name;
		this.major = major;
		this.sNo = sNo;
	}

	public Student(String name, String major, String sNo, int age) {
		super();
		this.name = name;
		this.major = major;
		this.sNo = sNo;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", sNo=" + sNo + ", age=" + age + "]";
	}

	
}
