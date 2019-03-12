package filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Uservo;

/**
 * Servlet Filter implementation class SessionFilter
 */
@WebFilter("/*")
public class SessionFilter implements Filter {

	
	List<String > list = new ArrayList();
  
   
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hsr = (HttpServletRequest)request;
		
		HttpServletResponse srs = (HttpServletResponse)response;
		System.out.println("++++++"+hsr.getServletPath());
		
		if(list.contains(hsr.getServletPath()))
		{
			chain.doFilter(request, response);
		}else {
			Uservo u = (Uservo) hsr.getSession().getAttribute("u");
		       if(u!=null) {
			
			     chain.doFilter(request, response);
		        }else {
			    String path= hsr.getServletContext().getContextPath();
			     
			  srs.sendRedirect(path+"/login.jsp");
		      }  
		
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		list.add("/login.jsp");
		list.add("/login.do");
	}

}
