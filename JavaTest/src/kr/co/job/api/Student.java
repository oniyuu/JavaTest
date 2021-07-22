/* [학생 클래스]
 * 이름(name),나이(age),학번(snum),전공(major)
 *    => private
 * 생성자 -> 4개필드
 * toString()
 */
package kr.co.job.api;

public class Student {
	private String name;
	private String age;
	private String snum;
	private String major;
	
	public Student() {
	}
	
	public Student(String name, String age, String snum, String major) {
		super();
		this.name = name;
		this.age = age;
		this.snum = snum;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "\n학생 [이름=" + name + ", 나이=" + age + ", 학번=" + snum + ", 전공=" + major + "]";
	}
	
}