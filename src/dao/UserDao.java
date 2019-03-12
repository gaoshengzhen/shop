package dao;



import com.oracle.jdbc.util.Dao;

import vo.Uservo;

public class UserDao {
	public Uservo login(String username,String password) {
		return Dao.queryOne("select * from user where username=? and password=md5(?)", Uservo.class, username,password);
	}
	public void count(int id) {
		Dao.executeSql("update user set logincount=logincount+1,lasttime=now() where userid=?", id);
	}

}
