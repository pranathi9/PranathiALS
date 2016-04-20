package collection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		String uqual = request.getParameter("uqual");
		String udes = request.getParameter("udes");
HttpSession httpSession = request.getSession();
printWriter.println("sid :"+httpSession.getAttribute("sid"));
printWriter.println("<br>");
printWriter.println("sname :"+httpSession.getAttribute("sname"));
printWriter.println("<br>");
printWriter.println("spassword :"+httpSession.getAttribute("spassword"));
printWriter.println("<br>");
printWriter.println("sconformpassword :"+httpSession.getAttribute("sconformpassword"));
printWriter.println("<br>");
printWriter.println("sname :"+httpSession.getAttribute("sname"));
printWriter.println("<br>");
printWriter.println("smarks :"+httpSession.getAttribute("smarks"));
printWriter.println("<br>");
printWriter.println("saverage :"+httpSession.getAttribute("saverage"));
printWriter.println("<br>");
printWriter.println("sclassteacher :"+httpSession.getAttribute("sclassteacher"));
printWriter.println("<br>");
printWriter.println("uname :"+httpSession.getAttribute("uname"));
printWriter.println("<br>");
printWriter.println("upassword :"+httpSession.getAttribute("upassword"));
printWriter.println("<br>");
printWriter.println("uqual:"+uqual);
printWriter.println("<br>");
printWriter.println("udes:"+udes);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
