package com.ssamz.web.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/loginProcess")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	
	
	
	public LoginServlet() {
		System.out.println("LoginServelet is created");
	}
	
	
	
	
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("----> service() 호출");
	}


	
	
	


	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		
		
		System.out.println("init is called");
	}





	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get method is called");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post method is called");
	}





	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println(" destroy is called" );
	}





	
	
	
	
	
	
}
