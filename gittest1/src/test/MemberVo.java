package test;

public class MemberVo {
	private String no;
	private String age;
	
	public MemberVo(){}
	public String getNo() {
		return no;
	}
	public MemberVo(String no, String age) {
		super();
		this.no = no;
		this.age = age;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
