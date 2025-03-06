package qp;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class SignInServlet extends GenericServlet{
 
	//SERVLETS
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String cont = req.getParameter("contact");
		long mob = Long.parseLong(cont); //parsing
		
		PrintWriter out = res.getWriter();

		String html = "<html> " 
					+ "<body> " 
					+ "<h1> "
					+"NAME : " + name
					+"EMAIL : " + email
					+"PASSWORD : " + pass
					+"CONTACT : " + mob
					+ "</h1>" 
					+ "</body>" 
					+ "</html>";

		out.print(html);
		
		//JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //LOAD THE DRIVER
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/signiin","root","root"); //ESTABLISH THE CONNECTION
			PreparedStatement ps = c.prepareStatement("insert into servletdetails values(?,?,?,?)"); //CREATE STATEMENT
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setString(3,pass);
			ps.setLong(4,mob); 
			ps.executeUpdate(); //EXECUTE QUERY
			c.close(); //CLOSE THE CONNECTION 
			out.print("<h1>Data stored</h1>");
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
	}	
}
