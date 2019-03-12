package vo;

import java.sql.Timestamp;

public class Uservo {
	private int userid;
	private String username;
	private String password;
	private String realname;
	private int logincount;
	private Timestamp lasttime;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getLogincount() {
		return logincount;
	}
	public void setLogincount(int logincount) {
		this.logincount = logincount;
	}
	public Timestamp getLasttime() {
		return lasttime;
	}
	public void setLasttime(Timestamp lasttime) {
		this.lasttime = lasttime;
	}
	public Uservo(String username, String password, String realname, int logincount, Timestamp lasttime) {
		super();
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.logincount = logincount;
		this.lasttime = lasttime;
	}
	public Uservo() {
		super();
	}
	@Override
	public String toString() {
		return "Uservo [userid=" + userid + ", username=" + username + ", password=" + password + ", realname="
				+ realname + ", logincount=" + logincount + ", lasttime=" + lasttime + "]";
	}
	 
}
