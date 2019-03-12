package listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class InitSessionListener
 *
 */
@WebListener
public class InitSessionListener implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public InitSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
      // System.out.println("session已经创建"+se.getSession().getId()+":"+new Date(se.getSession().getCreationTime()));
        int count=(Integer) se.getSession().getServletContext().getAttribute("count");
        se.getSession().getServletContext().setAttribute("count", count+1);
        
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
        // System.out.println("session已经销毁"+se.getSession().getId()+":"+new Date(se.getSession().getLastAccessedTime()));
         int count=(Integer) se.getSession().getServletContext().getAttribute("count");
         se.getSession().getServletContext().setAttribute("count", count-1);
    }
	
}
