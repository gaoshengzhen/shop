package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import vo.Book;

/**
 * Servlet implementation class Ch
 */
@WebServlet("/ch")
public class Ch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int id=Integer.valueOf(request.getParameter("bookid"));
		String name=request.getParameter("bookname");
		int price=Integer.valueOf(request.getParameter("bookprice"));
		String author = request.getParameter("author");
		BookDao book=new BookDao();
		Book b = new Book(name,price,author);
		b.setBookid(id);
		book.cha(b);
		response.sendRedirect("this");
	}

}
