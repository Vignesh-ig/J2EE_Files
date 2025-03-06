package qp;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.*;

public class AdditionServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {

		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");

		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);

		int result = a + b;

		PrintWriter out = res.getWriter();

		String html = "<html> " 
					+ "<body> " 
					+ "<h1> Result = " + result 
					+ "</h1>" 
					+ "</body>" 
					+ "</html>";

		out.print(html);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //LOAD THE DRIVER
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","root"); //ESTABLISH THE CONNECTION
			PreparedStatement ps = c.prepareStatement("insert into servletdetails values(?,?,?,?)"); //CREATE STATEMENT
			ps.setString(1,num1);
			ps.setString(2,num2);
			ps.executeUpdate(); //EXECUTE QUERY
			c.close(); //CLOSE THE CONNECTION 
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}

	}
}
