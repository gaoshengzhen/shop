package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import dao.UserDao;
import util.PageInfo;
import vo.Book;
import vo.Uservo;

/**
 * Servlet implementation class Add
 */
@WebServlet("/add")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name=request.getParameter("bookname");
		int price=Integer.valueOf(request.getParameter("bookprice"));
		String author=request.getParameter("author");
		System.out.println(name+price+author);
		Book b = new Book(name,price,author);
		BookDao book = new BookDao();
		
	    
		book.add(b);
		     
		response.sendRedirect("this");
	}

}
