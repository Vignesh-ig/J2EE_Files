package httpRequest;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HttpDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException  {
		PrintWriter out = res.getWriter();
		
		out.print("<h1> i am doGet </h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException,ServletException  {
		PrintWriter out = res.getWriter();
		
		out.print("<h1> i am doPUT </h1>");
	}
	
}
