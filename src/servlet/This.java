package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDao;
import util.PageInfo;

/**
 * Servlet implementation class This
 */
@WebServlet("/this")
public class This extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageInfo page = (PageInfo)request.getSession().getAttribute("page");
		
		int p = page.getP();
		BookDao ware  = new BookDao();
		 page.setP(p);
		int countn = page.getCountn();
		ware.page(page);
         if(page.getList().isEmpty()) {
        	 if(p>1)
        		 p=p-1;
         }
         page.setP(p);
         ware.page(page);
		request.setAttribute("page", page);
		
	  request.getRequestDispatcher("show.jsp").forward(request, response);
	
	}

}
