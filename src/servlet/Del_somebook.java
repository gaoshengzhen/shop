package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import dao.UserDao;
import vo.Uservo;

/**
 * Servlet implementation class Del_somebook
 */
@WebServlet("/del_somebook")
public class Del_somebook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String []id =request.getParameterValues("id") ;
		Integer []ids = new Integer[id.length];
		for(int j=0;j<id.length;j++) {
		    ids[j] = Integer.valueOf(id[j]);
		}
		BookDao book = new BookDao();
		
		
		book.delsome(ids);
		
		response.sendRedirect("this");;
	}
	  

}
