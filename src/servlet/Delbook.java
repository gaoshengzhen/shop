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
import vo.Uservo;

/**
 * Servlet implementation class Delbook
 */
@WebServlet("/del")
public class Delbook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.valueOf(request.getParameter("id"));
		BookDao book = new BookDao();
		
		book.del(id);
       PageInfo page = (PageInfo)request.getSession().getAttribute("page");
		
		System.out.println(page.getP());
		response.sendRedirect("this");
	}
  		
}
