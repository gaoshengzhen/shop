package dao;

import java.util.List;

import com.oracle.jdbc.util.Dao;

import util.PageInfo;
import vo.Book;

public class BookDao {
   public List<Book> getAll(){
	   return Dao.query("select * from book", Book.class);
   }
   public void page(PageInfo pagein) {
	  int p = pagein.getP();//得到当前页
	  
	  int pagesize=pagein.getPagesize();//得到每页显示条数

	  List list =Dao.query("select * from book order by bookid limit ?,?",Book.class, (p-1)*pagesize,pagesize);
      pagein.setList(list);//设置显示的记录
      Long countn = (Long)Dao.queryOne("select count(*) from book")[0];
      pagein.setCountn(countn.intValue());//得到总条数
      
   }
   public void del(int id) {
	   Dao.executeSql("delete from book where bookid=?", id);
   }
   public void cha(Book b) {
	   Dao.executeSql("update book set bookname=?,bookprice=?,author=? where bookid=?", b.getBookname(),b.getBookprice(),b.getAuthor(),b.getBookid());
   }
   public Book getone(int id) {
	   return Dao.queryOne("select * from book where bookid=?", Book.class, id);
   }
   public void add(Book b) {
	   Dao.executeSql("insert into book values(null,?,?,?)", b.getBookname(),b.getBookprice(),b.getAuthor());
	   //Dao.executesql("insert into book values(null,?,?,?)", b.getBookname(),b.getBookprice(),b.getAuthor());
   }
   public void delsome(Integer[] bookid) {
	   StringBuffer b = new StringBuffer();
	   for(int i=0;i<bookid.length;i++) {
			   b.append("?");
		   if(i<bookid.length-1)
			   b.append(",");
	   }
	   Dao.executeSql("delete from book where bookid in("+b.toString()+")", bookid);
   }
  
}
