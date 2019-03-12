package dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;

import vo.Warevo;

public class WareDao {
  public List<Warevo> getAll(){
	  return Dao.query("select * from ware", Warevo.class);
  }
  
  public void change(int lastware,int wareid) {
	  Dao.executeSql("update ware set lastware=? where wareid=?",lastware,wareid );
  }
  public Warevo getone(int id) {
	  return Dao.queryOne("select * from ware where wareid=?", Warevo.class, id);
  }
  public Warevo getone1(String name) {
	  return Dao.queryOne("select * from ware where warename=?", Warevo.class, name);
  }
  public void insert(Warevo vo) {
	  Dao.executeSql("insert into ware values(null,?,?,?,?)", vo.getWarename(),vo.getWareprice(),vo.getWarebigfrom(),vo.getWarefrom(),vo.getLastware());
  }
  
}
