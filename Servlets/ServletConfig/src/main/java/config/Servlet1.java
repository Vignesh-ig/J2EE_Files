package config;

import java.io.*;
import javax.servlet.*;

public class Servlet1 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		ServletConfig config = getServletConfig();

		String email = config.getInitParameter("email");

		PrintWriter out = res.getWriter();

		out.print("<h1> Email = " + email + "</h1>");
	}
}
