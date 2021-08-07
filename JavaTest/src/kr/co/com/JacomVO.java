package kr.co.job.jacom;

public class JacomVO {
	private int bno;
	private String title;
	private String content;
	private String bname;
	private int del;
	private String etc;

	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getDel() {
		return del;
	}
	public void setDel(int del) {
		this.del = del;
	}
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}
	
	@Override
	public String toString() {
		return "JacomVO [bno=" + bno + ", title=" + title + ", content=" + content + ", bname=" + bname + ", del=" + del
				+ ", etc=" + etc + "]";
	}
	
	

}
