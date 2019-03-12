package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import dao.UserDao;
import dao.WareDao;
import util.PageInfo;
import vo.Book;
import vo.Uservo;
import vo.Warevo;

/**
 * Servlet implementation class Showservlet
 */
@WebServlet("/show")
public class Showservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookDao ware  = new BookDao();
		PageInfo page = new PageInfo(request);
		
		ware.page(page);
		
		
      request.getSession().setAttribute("page", page);
		
	  request.getRequestDispatcher("show.jsp").forward(request, response);
			
	}

}
