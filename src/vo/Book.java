package vo;

public class Book {
   private int bookid;
   private String bookname;
   private int bookprice;
   private String author;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public int getBookprice() {
	return bookprice;
}
public void setBookprice(int bookprice) {
	this.bookprice = bookprice;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Book(String bookname, int bookprice, String author) {
	super();
	this.bookname = bookname;
	this.bookprice = bookprice;
	this.author = author;
}
public Book() {
	super();
}
@Override
public String toString() {
	return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + ", author=" + author
			+ "]";
}
   
}
