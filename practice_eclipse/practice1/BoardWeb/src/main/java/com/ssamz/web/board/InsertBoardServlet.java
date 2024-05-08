package com.ssamz.web.board;

import java.awt.image.Kernel;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssamz.biz.board.BoardDAO;
import com.ssamz.biz.board.BoardVO;



@WebServlet("/insertBoard.do")
public class InsertBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String encoding;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext context = getServletContext();
		this.encoding=context.getInitParameter("boardEncoding");
		request.setCharacterEncoding(encoding);
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		BoardDAO boardDAO = new BoardDAO();
		
		boardDAO.insertBoard(vo);
		
		response.sendRedirect("getBoardList.do");
		
		
		
		
		
		
	}

}
