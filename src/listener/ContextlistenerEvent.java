package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextlistenerEvent
 *
 */
@WebListener
public class ContextlistenerEvent implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextlistenerEvent() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
    	
         System.out.println("���һ��context��"+scae.getName()+":"+scae.getValue());
         //int count=(Integer)scae.getServletContext().getAttribute("count");
        // System.out.println(count);
        // scae.getServletContext().setAttribute("count", count+1);
         
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	System.out.println("ɾ��һ��context��"+scae.getName()+":"+scae.getValue());
        //int count=(Integer)scae.getServletContext().getAttribute("count");
        //System.out.println(count+1);
        //scae.getServletContext().setAttribute("count", count-1);
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	System.out.println("�޸�һ��context��"+scae.getName()+":"+scae.getValue());
        //System.out.println("�޸ĺ�"+scae.getServletContext().getAttribute(scae.getName()));
    }
	
}
