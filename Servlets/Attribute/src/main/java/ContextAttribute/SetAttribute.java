package ContextAttribute;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setAttribute")
public class SetAttribute extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student s = new Student("v",22,96);
//		req.getServletContext();
		ServletContext context = getServletContext();
		context.setAttribute("Student",s);
		PrintWriter out = resp.getWriter();
		out.print("<h1> Attribute added </h1>");
	}
}
