package qp;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class FetchDetailsServlet extends GenericServlet{
 
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

		
		
		//JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //LOAD THE DRIVER
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/signiin","root","root"); //ESTABLISH THE CONNECTION
			PreparedStatement ps = c.prepareStatement("select name,email,contact from servletdetails where contact=?"); //CREATE STATEMENT
			ps.setLong(1,mob);
			ResultSet result = ps.executeQuery(); //EXECUTE QUERY
			if (result.next()) {
				out.print(html);
			}
			
			c.close(); //CLOSE THE CONNECTION 
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
	}	
}
