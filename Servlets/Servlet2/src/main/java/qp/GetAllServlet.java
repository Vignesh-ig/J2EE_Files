package qp;

import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class GetAllServlet extends GenericServlet{
 
	//SERVLETS
	@Override
	public void service(ServletRequest req, ServletResponse res)throws ServletException, IOException {
				
		PrintWriter out = res.getWriter();

		String html = "<html> " 
				+ "<body> " 
				+"<table border='2px'>"
				+"<tr>" 
				+"<th>NAME</th>"
				+"<th>EMAIL</th>"
				+"<th>CONTACT</th>"
				+"<th>PASS</th>"
				+"</tr>";
		
		//JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //LOAD THE DRIVER
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/signiin","root","root"); //ESTABLISH THE CONNECTION
	
			Statement s = c.createStatement();
			
			ResultSet rs = s.executeQuery("select * from servletdetails");
			
			while(rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("emails");
				String pass = rs.getString("password");
				String contact = rs.getString("contact");
				
				html = html
						+"<tr>" 
						+"<td>"+name+"</td>"
						+"<td>"+email+"</td>"
						+"<td>"+pass+"</td>"
						+"<td>"+contact+"</td>"
						+"</tr>";
			}
			
			c.close(); //CLOSE THE CONNECTION 
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		html = html
				+"</table>"
				+"</body>"
				+"</html>"; 
		out.print(html);
		
	}

}
