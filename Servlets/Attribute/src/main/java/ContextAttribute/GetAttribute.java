package ContextAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getAttribute")
public class GetAttribute extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		Object o = context.getAttribute("Student");
		Student s = (Student) o ;
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ s +"</h1>");
	}
}
