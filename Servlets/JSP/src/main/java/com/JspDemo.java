package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JspDemo")
public class JspDemo extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			JspStudent s = new JspStudent();
			s.setId(1);
			s.setName("Peter");
			s.setMark(74);
			s.setAge(25);
			
			req.setAttribute("JspStudent", s);
			RequestDispatcher dispatcher = req.getRequestDispatcher("JspDemo.jsp");
			dispatcher.forward(req, resp);
		}
}
