package com.ssamz.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.ssamz.biz.common.JDBCUtility;

public class userDAO {

	private Connection connection = null;
	private PreparedStatement stmt = null;
	private ResultSet rSet = null;

	private String uSER_LIString = "select * from users";
	private String uSER_INSERTString = "insert into users values(?, ?, ?, ?)";
	private String USER_UPDATE = "update users set name=?, role=? where id=?";
	private String uSER_DELETE = "delete users where id=?";
	private String uSER_GET = "select * from users where id=?";

	public void deleteUser(String id) {

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_DELETE);
			stmt.setString(1, id);
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}

	}

	public void updateUser(UserVO vo) {

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(USER_UPDATE);
			stmt.setString(1, vo.getName());
			stmt.setString(2, vo.getRole());
			stmt.setString(3, vo.getId());
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}

	}

	public void insertUser(UserVO vo) {

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_INSERTString);
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			stmt.setString(3, vo.getName());
			stmt.setString(4, vo.getRole());
			stmt.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(stmt, connection);
		}

	}

	public List<UserVO> getUserList() {

		List<UserVO> userList = new ArrayList<UserVO>();

		try {

			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_LIString);
			rSet = stmt.executeQuery();

			while (rSet.next()) {
				UserVO user = new UserVO();
				user.setId(rSet.getString("ID"));
				user.setPassword(rSet.getString("PASSWORD"));
				user.setName(rSet.getString("NAME"));
				user.setRole(rSet.getString("ROLE"));
				userList.add(user);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(rSet, stmt, connection);
		}
		return userList;

	}

	public void getUserList2() {

		try {

			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_LIString);
			rSet = stmt.executeQuery();

			System.out.println("[USER 목록]");

			while (rSet.next()) {
				System.out.println(rSet.getString("NAME") + "의 권한 : " + rSet.getString("role"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(rSet, stmt, connection);
		}

	}

	public void getUserCount() {
		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_LIString);
			rSet = stmt.executeQuery();

			int userCount = 0;

			while (rSet.next()) {
				userCount++;
			}
			System.out.println("회원 수 : " + userCount);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDBCUtility.close(rSet, stmt, connection);
		}

	}

	public UserVO getUser(UserVO vo) {

		UserVO user = null;

		try {
			connection = JDBCUtility.getConnection();
			stmt = connection.prepareStatement(uSER_GET);
			stmt.setString(1, vo.getId());

			rSet = stmt.executeQuery();

			while (rSet.next()) {
				user = new UserVO();
				user.setId(rSet.getString("id"));
				user.setPassword(rSet.getString("password"));
				user.setName(rSet.getString("name"));
				user.setRole(rSet.getString("role"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			JDBCUtility.close(rSet, stmt, connection);
		}
		
		return user;

	}

}
