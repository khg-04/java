package user2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import user1.User1;

public class User2Dao {
	
	// 싱글톤
	private static User2Dao instance = new User2Dao();
	public static User2Dao getInstance() {
		return instance;
	}
	private User2Dao() {}
	
	// DB정보
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";
	// 커넥션
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
		}
	
	// 리소스
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;
	
	// 기본 CRUD 메서드
	public void insertUser2(User2 user) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_USER2);
			psmt.setString(1, user.getUid());
			psmt.setString(2, user.getName());
			psmt.setString(3, user.getBirth());
			psmt.setString(4, user.getAddr());
			psmt.executeUpdate();
			closeAll();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public User2 selectUser2(String uid) {
		
		User2 user = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER2);
			psmt.setString(1, uid);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				user = new User2();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
				
			}
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public List<User2> selectUser2List() {
		
		List<User2> list = new ArrayList();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_USER2_LIST);
			
			while(rs.next()) {
				User2 user = new User2();
				user.setUid(rs.getString(1));
				user.setName(rs.getString(2));
				user.setBirth(rs.getString(3));
				user.setAddr(rs.getString(4));
				list.add(user);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public void updateUser2(User2 user) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.UPDATE_USER2);
			psmt.setString(1, user.getName());
			psmt.setString(2, user.getBirth());
			psmt.setString(3, user.getAddr());
			psmt.setString(4, user.getUid());
			psmt.executeUpdate();
			closeAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser2(String uid) {
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER2);
			psmt.setString(1, uid);
			closeAll();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 통합 close(자원해제) 메서드
	public void closeAll() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
}
