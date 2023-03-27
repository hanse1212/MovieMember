package cgvMbAr;

public class Account {
	String id, pw;
	
	public Account() {}
	public Account(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + "]";
	}
	
}
