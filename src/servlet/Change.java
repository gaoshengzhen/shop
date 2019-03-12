package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import dao.UserDao;
import vo.Book;
import vo.Uservo;

/**
 * Servlet implementation class Change
 */
@WebServlet("/change")
public class Change extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          int n = Integer.valueOf(request.getParameter("id"));
          BookDao b = new BookDao();
          Book book= b.getone(n);      
          //b.cha(book);
          
       
  			request.setAttribute("book", book);
          request.getRequestDispatcher("change.jsp").forward(request, response);
	 }
  		

}
