package com.ssamz.web.user;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssamz.biz.user.UserVO;
import com.ssamz.biz.user.userDAO;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		System.out.println("LoginServelet is created");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String id = request.getParameter("id");
		String password= request.getParameter("password");
		
		UserVO vo = new UserVO();
		
		vo.setId(id);
		
		userDAO dao = new userDAO();
		UserVO user = dao.getUser(vo);
		
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
		
		if(user!=null) {
			
			if(user.getPassword().equals(password)) {
				out.println(user.getName()+"님의 로그인 환영!!<br>");
				out.println("<a href='/getBoardList.do'>글 목록 이동</a>");
									
			}else {
				out.println("비밀번호 오류입니다.<br>");
				out.println("<a href='/'>다시 로그인</a>");
			}			
			
		}else {
			
			out.println("아이디 오류입니다.<br>");
			out.println("<a href='/'>다시 로그인</a>");
		}
		
		
		
		
		
		
		
		
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

		System.out.println(" destroy is called");
	}

}
