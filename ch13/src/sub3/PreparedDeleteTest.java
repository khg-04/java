package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜: 2025/01/23
 * 이름: 김효경
 * 내용: Java CURD 실습하기
 */
public class PreparedDeleteTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/StudyDB";
		String user = "root";
		String pass = "1234";
		
		try {
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성
			String sql = "DELETE FROM `user1` WHERE `uid`=?"; 
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "j101");
			System.out.println(psmt);
			
			// 4단계 - SQL 실행
			psmt.executeUpdate();
			
			// 5단계 - 조회결과 확인
			// 6단계 - 데이터베이스 종료
			psmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}
}