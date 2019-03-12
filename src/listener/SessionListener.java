package listener;


import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import vo.Uservo;

/**
 * Application Lifecycle Listener implementation class SessionListener
 *
 */
@WebListener
public class SessionListener implements HttpSessionAttributeListener {

    
	
	static ConcurrentHashMap<String,HttpSession> map = new ConcurrentHashMap<String,HttpSession>();
    public SessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
        // System.out.println("���һ��session"+se.getName());
         if(se.getName().equals("u")) {
        	 Uservo vo =(Uservo)se.getValue();
        	   if(map.containsKey(vo.getUsername())) {
        		   map.remove(vo.getUsername()).invalidate();
        	   }
        		   
        	   map.put(vo.getUsername(),se.getSession());
        		System.out.println(vo.getUsername()+"--------------------������");   
        	   
        	   
        	 }
        // se.getSession().getServletContext().setAttribute("map", map);
 
         }
         

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	//System.out.println("ɾ��һ��session"+se.getName());
    	if(se.getName().equals("u")) {
        	Uservo vo = (Uservo)se.getValue();
        	map.remove(vo.getUsername());
        	System.out.println(vo.getUsername()+"--------------------������");   
         }
    	//se.getSession().getServletContext().setAttribute("map", map);
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	//System.out.println("�ı���һ��listener:"+se.getName()+":"+se.getValue());
    	if(se.getName().equals("u")) {
    		
    		Uservo vo = (Uservo)se.getValue();
    		
    		map.remove(vo.getUsername());
    		
        	System.out.println(vo.getUsername()+"--------------------������"); 

        	Uservo u =(Uservo)se.getSession().getAttribute("u");
        	
        	 if(map.containsKey(u.getUsername())) {
      		   map.remove(u.getUsername()).invalidate();
      	   }
        	map.put(u.getUsername(), se.getSession());
        	 
      		System.out.println(u.getUsername()+"--------------------������"); 
    	}
    	
    	
    	
    }
	
}
