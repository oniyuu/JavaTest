package kr.co.job.jdbc;

public class Alist {
	private int tno;
	private String pname;
	private int age;
	private String etc;
	
	public Alist() {
		
	}

	public Alist(int tno, String pname, int age, String etc) {
		super();
		this.tno = tno;
		this.pname = pname;
		this.age = age;
		this.etc = etc;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEtc() {
		return etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	@Override
	public String toString() {
		return "Alist [번호=" + tno + ", 이름=" + pname + ", 나이=" + age + ", 비고=" + etc + "]";
	}

}
