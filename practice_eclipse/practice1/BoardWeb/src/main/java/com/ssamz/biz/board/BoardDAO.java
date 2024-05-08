package com.ssamz.biz.board;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ssamz.biz.common.JDBCUtility;

public class BoardDAO {

	private Connection connection;
	private PreparedStatement stmt;
	private ResultSet rSet;

	private static String bOARD_INSERT = "insert into board(seq, title, writer, content) values((select nvl(max(seq),0)+ 1 from board),?,?,?)";
	
	private static String bOARD_UPDATE= "update board set title=?, content=? where seq=?";

	private static String BOARD_DELETE = "delete board where seq=?";

	private static String BOARD_GET = "select * from board where seq=?";

	private static String bOARD_LIST = "select * from board order by seq desc";

	public void insertBoard(BoardVO vo) {

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(bOARD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}

	}
	
	public void updateBoard(BoardVO vo) {
		
		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(bOARD_UPDATE);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent());
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}
		
	}

	public void deleteBoard(BoardVO vo) {

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(BOARD_DELETE);
			stmt.setInt(1, vo.getSeq());
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}

	}

	public BoardVO getBoard(BoardVO vo) {

		BoardVO board = null;

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(BOARD_GET);
			stmt.setInt(1, vo.getSeq());
			rSet = stmt.executeQuery();

			if (rSet.next()) {
				board = new BoardVO();

				board.setSeq(rSet.getInt("seq"));
				board.setTitle(rSet.getString("title"));
				board.setWriter(rSet.getString("writer"));
				board.setContent(rSet.getString("content"));
				board.setRegDate(rSet.getDate("regdate"));
				board.setCnt(rSet.getInt("cnt"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(rSet, stmt, connection);
		}
		return board;
	}

	

	public List<BoardVO> getBoardList(BoardVO vo) {

		List<BoardVO> boardList = new ArrayList<BoardVO>();

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(bOARD_LIST);
			rSet = stmt.executeQuery();

			while (rSet.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rSet.getInt("seq"));
				board.setTitle(rSet.getString("title"));
				board.setWriter(rSet.getString("writer"));
				board.setContent(rSet.getString("content"));
				board.setRegDate(rSet.getDate("regdate"));
				board.setCnt(rSet.getInt("cnt"));
				boardList.add(board);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(rSet, stmt, connection);
		}
		return boardList;

	}

}
