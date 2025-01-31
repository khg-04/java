package user3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Dao 클래스
 * 	- Data Access Object
 * 	- 데이터베이스 테이블 CRUD 처리 객체
 */
public class User3Dao {
		
	// 싱글톤
	private static User3Dao instance = new User3Dao();
	public static User3Dao getInstance() {
		return instance;
	}
	private User3Dao() {}
		
	// DB정보
	private final String HOST = "jdbc:mysql://localhost:3306/studydb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
}
