package net.pigor.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import net.pigor.scheduler.CronScheduler;

/**
 * Servlet implementation class InitializerServlet
 */
public class InitializeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitializeServlet() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
	        System.out.println("Initializing NewsLetter PlugIn");

	        new CronScheduler();
	    }
	    catch (Exception ex) {
	      ex.printStackTrace();
	    }
	}

}
