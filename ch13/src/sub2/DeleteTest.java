package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜: 2025/01/23
 * 이름: 김효경
 * 내용: Java CURD 실습하기
 */
public class DeleteTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/StudyDB";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성(Statement: SQL 실행)
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "DELETE FROM `user1` WHERE `uid`='j101'";
			stmt.executeUpdate(sql);
			
			// 5단계 - ResultSet 결과 처리(Select인 경우만 해당)
				// Java에서 DB로 결과를 insert하기 때문에 5단계는 건너뜀
			
			
			// 6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료..");
	}

}