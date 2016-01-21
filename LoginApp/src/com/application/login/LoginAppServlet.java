package com.application.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginAppServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		//resp.setContentType("text/plain");
		//resp.getWriter().println("Hello, world");
		
		RequestDispatcher rd;
		
		String userName=req.getParameter("uName");
		String password=req.getParameter("uPass");
		
		  User user=new User(userName,password);
		
		//user.setUserName(userName);
		//user.setPassword(password);
		
		req.setAttribute("user", user);
		
		if(user.isValid())
		{
			rd=req.getRequestDispatcher("Welcome.jsp");
			rd.forward(req, resp);
		}
		
		else
		{
			rd=req.getRequestDispatcher("Error.jsp");
			rd.forward(req, resp);
		}
		
		
		
		
	}
}
