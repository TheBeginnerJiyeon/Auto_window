package com.multi.gameProject.generalUsers.model.userDAO;

import com.multi.gameProject.generalUsers.model.userDTO.UserDto;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
// java.sql.SQLRecoverableException: 접속 종료
// 사용자 : scott / tiger , 테이블 :  USERS
public class UserDao {
	
	private Properties prop = null;
	
	// 유저 다오의 유일한 생성자인  기본 생성자가 생길 때 쿼리 내용을 담고있는 파일을 읽게 함
	public UserDao() {
		
		prop = new Properties();
		try {
			prop.load(new FileReader("resources/generalUser/generlUsersQuery.properties"));
		} catch (IOException e) {
			System.out.println("userDao() 생성 에러 발생!!");
			throw new RuntimeException(e);
		}
		
		
	}
	
	
	// 회원가입 : 유저 생성
	public int insertUser(Connection conn, UserDto newUser) {
		
		PreparedStatement ps = null;
		int result = 0;
		
		
		try {
			
			String sql = prop.getProperty("insertUser");
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, newUser.getUser_Id());
			ps.setString(2, newUser.getPw());
			ps.setString(3, newUser.getName());
			ps.setInt(4, newUser.getAge());
			ps.setString(5, newUser.getTel());
			ps.setString(6, newUser.getEmail());

			
			result = ps.executeUpdate();
			
			System.out.println("sql문 전송 결과 result : " + result);
			
			if (result > 0) {
				System.out.println("데이터 입력 완료");
				conn.commit();
				System.out.println("커밋 완료");
				
			} else {
				System.out.println("데이터 입력 실패,,,");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println("sql 에러 발생!!");
			e.printStackTrace();
			
		} finally {
			
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
			
		}
		return result; // result ==0 이면 중복 아이디 존재!!
		
	}
	
	
	// 회원 탈퇴 : 본인의 아이디, 비밀번호 유저 삭제
	// 아이디, 비밀번호를 한번 더 입력하게 할 예정
	public int deleteUser(Connection conn, String user_Id, String pw) {
		
		PreparedStatement ps = null;
		int result = 0;
		
		
		try {
			String sql = prop.getProperty("deleteUser");
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, user_Id);
			ps.setString(2, pw);
			
			result = ps.executeUpdate();
			
			System.out.println("sql문 전송 결과 result : " + result);
			
			if (result > 0) {
				System.out.println("데이터 삭제 완료");
				conn.commit();
				System.out.println("커밋 완료");
				
			} else {
				System.out.println("데이터 삭제 실패,,,");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println("sql 에러 발생!!");
			e.printStackTrace();
			
		} finally {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
			
		}
		return result; // result ==0 이면 아이디 존재 안함 또는 비밀번호 불일치!!
		
	}
	
	/*// 유저 전부 조회
	// 관리자 기능으로 주석처리
	public ArrayList<UserDto> selectAll(Connection conn) {
		
		ArrayList<UserDto> list = null;
		
		
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("selectAll");
		try {
			stmt = conn.createStatement();
			
			rset = stmt.executeQuery(sql);
			
			list = new ArrayList<UserDto>();
			
			while (rset.next()) {
				
				UserDto userDto = new UserDto();
				userDto.setUser_Id(rset.getString("user_id"));
				userDto.setPw(rset.getString("pw"));
				userDto.setCoin_Count(rset.getInt("coin_count"));
				userDto.setName(rset.getString("name"));
				userDto.setAge(rset.getInt("age"));
				userDto.setTel(rset.getString("tel"));
				userDto.setEmail(rset.getString("email"));
				userDto.setSingup_Date(rset.getDate("signup_date"));
				userDto.setDel_Acc(rset.getString("del_acc").charAt(0));
				userDto.setDelete_Acc_Date(rset.getDate("delete_acc_date"));
				
				list.add(userDto);
			}
		} catch (SQLException e) {
			System.out.println("sql 에리 발생!!");
			e.printStackTrace();
			
		} finally {
			close(rset);
			close(stmt);
		}
		return list;
	}*/
	
	
	// 유저 아이디로 본인 정보 조회
	// 유저의 기능이므로 본인의 아이디가 자동으로 들어가게 설계
	public UserDto selectUser(Connection conn, String user_Id) {
		
		PreparedStatement ps = null;
		ResultSet rset = null;
		UserDto userDto = null;
		
		try {
			String sql = prop.getProperty("selectUser");
			
			ps = conn.prepareStatement(sql);
			
			System.out.println("sql문 객체 생성 성공");
			
			ps.setString(1, user_Id);
			
			rset = ps.executeQuery();
			
			if (rset.next()) { // 이미 로그인이 된 상태에서 전달하므로 자신의 정보는 존재할 예정
				
				userDto = new UserDto();
				userDto.setUser_Id(rset.getString("user_id"));
				userDto.setPw(rset.getString("pw"));
				userDto.setCoin_Count(rset.getInt("coin_count"));
				userDto.setName(rset.getString("name"));
				userDto.setAge(rset.getInt("age"));
				userDto.setTel(rset.getString("tel"));
				userDto.setEmail(rset.getString("email"));
				userDto.setSingup_Date(rset.getDate("signup_date"));
				userDto.setDel_Acc(rset.getString("del_acc").charAt(0));
				userDto.setDelete_Acc_Date(rset.getDate("delete_acc_date"));
			}
			System.out.println("성공적으로 rset이 전달되었습니다.");
			
		} catch (SQLException e) {
			System.out.println("sql 에러 발생!!");
			e.printStackTrace();
			
		} finally {
			try {
				rset.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
			
		}
		return userDto; // 본인의 정보를 전달
		
	}
	
	
	//  로그인
	public UserDto userLogin(Connection conn, String user_Id, String pw) {
		
		PreparedStatement ps = null;
		ResultSet rset = null;
		UserDto userDto = null;
		
		
		try {

			String sql = prop.getProperty("UserLogin");
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, user_Id);
			ps.setString(2, pw);
			
			rset = ps.executeQuery();
			
			System.out.println("sql문 전송 성공!! : " + rset);
			
			if (rset.next()) {
				userDto = new UserDto();
				userDto.setUser_Id(rset.getString("user_id"));
				userDto.setPw(rset.getString("pw"));
				userDto.setCoin_Count(rset.getInt("coin_count"));
				userDto.setName(rset.getString("name"));
				userDto.setAge(rset.getInt("age"));
				userDto.setTel(rset.getString("tel"));
				userDto.setEmail(rset.getString("email"));
				userDto.setSingup_Date(rset.getDate("signup_date"));
				userDto.setDel_Acc(rset.getString("del_acc").charAt(0));
				userDto.setDelete_Acc_Date(rset.getDate("delete_acc_date"));
				
			}
			
			
		} catch (SQLException e) {
			System.out.println("sql 에러 발생!! 회원 존재 안함");
			e.printStackTrace();
			
		} finally {
			try {
				rset.close();
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
			
		}
		return userDto; // 앞으로 나의 정보 관리를 위해 계속 사용될 로그인의 반환값인 디티오
		
	}


	// 로그아웃은 컨트롤러에서 확인을 누르면 바로 초기화면으로 돌아가게 설정함
	// 또한 나의 정보를 나타내는 dto를 dao 메서드를 호출하는 곳에서 null로 초기화할 것
	
	
	// 회원 업데이트. 로그인 된 상태이므로 아이디 확인 없이 바로 가져온다
	// 직접 수정 입력한 값을 가져오는 매개변수 디티오
	public int updateUser(Connection conn, UserDto updatedUser){
		
		PreparedStatement ps = null;
		int result = 0;
		
		
		try {
			String sql = prop.getProperty("updateUser");
			
			ps = conn.prepareStatement(sql);
			
			// 받은 입력값을 ps에 담아보냄
			ps.setString(1, updatedUser.getUser_Id());
			ps.setString(2, updatedUser.getPw());
			ps.setString(3, updatedUser.getName());
			ps.setInt(4, updatedUser.getAge());
			ps.setString(5, updatedUser.getTel());
			ps.setString(6, updatedUser.getEmail());

			
			result = ps.executeUpdate();
			
			System.out.println("sql문 전송 결과 result : " + result);
			
			if (result > 0) {
				System.out.println("데이터 수정 완료");
				conn.commit();
				System.out.println("커밋 완료");
				
			} else {
				System.out.println("데이터 수정 실패,,,");
				conn.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println("sql 에러 발생!!");
			e.printStackTrace();
			
		} finally {
			
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
			
		}
		return result;
		
	}
}