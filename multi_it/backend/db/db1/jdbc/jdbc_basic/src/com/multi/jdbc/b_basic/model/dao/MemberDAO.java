package com.multi.jdbc.b_basic.model.dao;

import com.multi.jdbc.b_basic.model.dto.MemberDTO;

import java.sql.*;

public class MemberDAO {
	
	
	public void insert(String id, String pw, String name, String tel) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			String sql = "insert into MEMBER values (?, ?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			
			System.out.println("4. sql문 객체 생성 성공");
			
			int result = ps.executeUpdate(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			
			System.out.println("5. sql문 전송 성공, 결과1>> " + result);
			
			// 트랜잭션 커밋
			if (result >= 1) {
				System.out.println("데이터 입력 완료");
				con.commit();
				System.out.println("6. 트랜잭션 커밋 완료.");
				
			}
			// Query가 제대로 실행되지 않은 경우
			else {
				System.out.println("데이터 입력 실패");
				con.rollback();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
		
	}
	
	
	public void delete(String id) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			// 자동으로 ; 들어감
			String sql = "delete from MEMBER where id = ?";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setInt(1, Integer.parseInt(id));
			
			
			System.out.println("4. sql문 객체 생성 성공");
			
			int result = ps.executeUpdate(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			
			System.out.println("5. sql문 전송 성공, 결과1>> " + result);
			
			// 트랜잭션 커밋
			if (result >= 1) {
				System.out.println("데이터 삭제 완료");
				con.commit();
				System.out.println("6. 트랜잭션 커밋 완료.");
				
			}
			// Query가 제대로 실행되지 않은 경우
			else {
				System.out.println("데이터 삭제 실패");
				con.rollback();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
		
	}
	
	public void insert(MemberDTO memberDto) {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			String sql = "insert into MEMBER values (?, ?, ?, ?, SYSDATE)";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setInt(1, memberDto.getId());
			ps.setString(2, memberDto.getPw());
			ps.setString(3, memberDto.getName());
			ps.setString(4, memberDto.getTel());
			
			
			System.out.println("4. sql문 객체 생성 성공");
			
			int result = ps.executeUpdate(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			
			System.out.println("5. sql문 전송 성공, 결과1>> " + result);
			
			// 트랜잭션 커밋
			if (result >= 1) {
				System.out.println("데이터 입력 완료");
				con.commit();
				System.out.println("6. 트랜잭션 커밋 완료.");
				
			}
			// Query가 제대로 실행되지 않은 경우
			else {
				System.out.println("데이터 입력 실패");
				con.rollback();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
		
	}
	
	
	public MemberDTO selectOne(String id) {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberDTO memberDTO = null;
		
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			String sql = "select * from MEMBER where id = ?";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setInt(1, Integer.parseInt(id));
			
			System.out.println("4. sql문 객체 생성 성공");
			
			rs = ps.executeQuery(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			if (rs.next()) {
				
				// https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm
				
				memberDTO = new MemberDTO();
				memberDTO.setId(rs.getInt("id"));
				memberDTO.setTel(rs.getString("tel"));
				memberDTO.setPw(rs.getString("pw"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setCreatedate(rs.getDate("creat_date"));
				
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
		return memberDTO;
		
	}
	
	
	public MemberDTO logIn(MemberDTO memberDTO) {
	
		MemberDTO rsDTO = null;
		
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			String sql = "select * from MEMBER where id = ? and pw=?";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setInt(1, memberDTO.getId());
			ps.setString(2, memberDTO.getPw());
			
			System.out.println("4. sql문 객체 생성 성공");
			
			rs = ps.executeQuery(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			if (rs.next()) {
				
				// https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm
				
				rsDTO = new MemberDTO();
				rsDTO.setId(rs.getInt("id"));
				rsDTO.setTel(rs.getString("tel"));
				rsDTO.setPw(rs.getString("pw"));
				rsDTO.setName(rs.getString("name"));
				rsDTO.setCreatedate(rs.getDate("creat_date"));
				
				
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
	
	
		return rsDTO;
	
	
	}
	
	
	public void update(MemberDTO memberDTO) {
		
		Connection con = null;
		PreparedStatement ps = null;
		memberDTO = new MemberDTO();
		
		try {
			
			// 1.Jdbc driver 등록 처리 : 해당 database 벤더 사가 제공하는 클래스 등록
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공..");
			
			
			String url = "jdbc:oracle:thin:@//localhost:1521/XE";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 성공.");
			
			// 오토커밋을 false로 설정
			con.setAutoCommit(false);
			System.out.println("3. 오토커밋 설정 비활성화.");
			
			// sql문 만들기 , preparedstatement :준비된 문장 만들기
			String sql = "update MEMBER set tel=? where id=?)";
			ps = con.prepareStatement(sql); // 처리 된 행 수
			
			// ?에 입력될 순서대로 잘 매핑시키기
			ps.setString(1, memberDTO.getTel());
			ps.setInt(2, memberDTO.getId());
			
			
			System.out.println("4. sql문 객체 생성 성공");
			
			int result = ps.executeUpdate(); //ps 객체 실행, 쿼리실행, 반환값(변경된 행의 수) 넘어옴 받아줌.
			
			
			System.out.println("5. sql문 전송 성공, 결과1>> " + result);
			
			// 트랜잭션 커밋
			if (result >= 1) {
				System.out.println("데이터 입력 완료");
				con.commit();
				System.out.println("6. 트랜잭션 커밋 완료.");
				
			}
			// Query가 제대로 실행되지 않은 경우
			else {
				System.out.println("데이터 입력 실패");
				con.rollback();
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			if (con != null) {
				try {
					con.rollback(); // 예외 발생 시 롤백
				} catch (SQLException ex) {
					ex.printStackTrace();
					
				}
				System.out.println("트랜잭션 롤백.");
			}
			
			
		} finally {
			try {
				ps.close(); // 먼저닫기
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
				
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}

