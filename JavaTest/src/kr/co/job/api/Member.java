/*
 * 모델링(기획->설계)
 * 회원 : 순번, 아이디, 이름, 나이, 취미, 종교...
 * 속성 - 필수데이터, 선택데이터
 * 기능 - 가입하기, 수정하기, 삭제하기, 회원조회(전체,선택) => 제어하기위한 메인(Control)
 * 생성자 -> 객체를 인스턴스할 때 필드 값을 초기화
 */
package kr.co.job.api;

public class Member {
	private int no;
	private String id;
	private String name;
	private int age;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	//생성자 generate constructor using fields
	public Member(int no, String id, String name, int age) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.age = age;
	}
	

	//setter, getter 작성
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// toString을 사용하여 sysout으로 표시될 수 있게 만듬
	@Override
	public String toString() {
		return "회원 [번호=" + no + ", id=" + id + ", 이름=" + name + ", 나이=" + age + "]";
	}
	

}