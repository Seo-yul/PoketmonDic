package poketmon.vo;

public class Manager {
	private int no;
	private String name;
	private String pwd;
	
	public Manager(int no, String name, String pwd) {
		this.no = no;
		this.name = name;
		this.pwd = pwd;
	}
	
	public Manager() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
