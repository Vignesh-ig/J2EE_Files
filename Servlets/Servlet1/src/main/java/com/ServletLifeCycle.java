package com;

import java.io.IOException;

import javax.servlet.*;

public class ServletLifeCycle extends GenericServlet {

	@Override
	public void init() {
		System.out.println("hey am init method");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("hey am service method");
	}


	@Override
	public void destroy() {
		System.out.println("hey am destroy method");
	}

}
