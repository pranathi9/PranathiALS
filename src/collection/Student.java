package collection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DatabaseServlet
 */
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
    private Connection connection;
    public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		ServletContext context = config.getServletContext();
   	 String Driver = context.getInitParameter("driver");
   	 String url = context.getInitParameter("url");
   
   	try
	{
		Class.forName(Driver);
		connection = DriverManager.getConnection(url,"system","lokesh");
		
	}
	catch(Exception e)
	{
		
	}
		
		super.init(config);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//ServletContext context = request.getServletContext();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		String sname = request.getParameter("sname");
		String sid = request.getParameter("sid");
		String spassword = request.getParameter("spassword");
		String sconformpassword = request.getParameter("sconformpassword");
		String smarks = request.getParameter("smarks");
		String saverage = request.getParameter("saverage");
		String sclassteacher = request.getParameter("sclassteacher");
		HttpSession session = request.getSession();
	session.setAttribute("sname", sname);
	session.setAttribute("sid", sid);
	session.setAttribute("spassword", spassword);
	session.setAttribute("sconformpassword", sconformpassword);
	session.setAttribute("smarks", smarks);
	session.setAttribute("saverage", saverage);
	session.setAttribute("sclassteacher", sclassteacher);
	request.getRequestDispatcher("login.html").forward(request, response);
	
	
		
		try
		{
			Statement statement = connection.createStatement();
			//String retrive ="select * from Student";
			ResultSet set = statement.executeQuery("select * from student");
			
			while(set.next())
			{
				String dname = set.getString(4);
				//printWriter.println(dname);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//printWriter.println(connection);
		
	//printWriter.println(connection);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
