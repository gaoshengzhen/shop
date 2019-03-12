package dao;

import java.util.ArrayList;
import java.util.List;

import com.oracle.jdbc.util.Dao;

import vo.MyWarevo;

public class MyWareDao {
       public List<MyWarevo> getAll(){
    	   return Dao.query("select * from myware", MyWarevo.class);
       }
       
       public void insert(MyWarevo v) {
    	   Dao.executeSql("insert into myware values(null,?,?,?)",v.getWarename(),v.getWareprice(),v.getLastware());
       }
       public void del(int id) {
    	   Dao.executeSql("delete from myware where wareid=?", id);
       }
       public MyWarevo getone(int id) {
    	   return Dao.queryOne("select * from myware where wareid=?", MyWarevo.class, id);
       }
       public MyWarevo getone1(String name) {
    	   return Dao.queryOne("select * from myware where warename=?", MyWarevo.class, name);
       }
       public void update(int lastware,String name) {
    	   Dao.executeSql("update myware set lastware=? where warename=?",lastware,name);
       }
}
