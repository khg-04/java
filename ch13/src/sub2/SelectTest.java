package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜: 2025/01/23
 * 이름: 김효경
 * 내용: Java CURD 실습하기
 */

public class SelectTest {
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://localhost:3306/StudyDB";
		String user = "root";
		String pass = "1234";
		
		// 결과셋 저장 리스트 생성
		List<User1> users = new ArrayList<>();
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계 - SQL 실행 객체 생성(Statement: SQL 실행)
			Statement stmt = conn.createStatement();
			
			// 4단계 - SQL 실행
			String sql = "SELECT * FROM `user1`";
			ResultSet rs = stmt.executeQuery(sql); // SELECT 문은 executeQuery()메서드로 실행
			
			// 5단계 - ResultSet 결과 처리(Select인 경우만 해당)
			while(rs.next()) {
				// ResultSet 커서를 데이터 갯수만큼 next() 시켜 각 컬럼별 데이터 추출
				
				String uid = rs.getString(1);
				String name = rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);
				
				// 추출된 데이터를 가지고 User1 엔티티 객체 생성 및 초기화
				User1 user1 = new User1();
				user1.setUid(uid);
				user1.setName(name);
				user1.setHp(hp);
				user1.setAge(age);
				
				// User1 엔티티 객체 리스트 저
				users.add(user1);
			}
			
			// 6단계 - 데이터베이스 종료
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 리스트 출력
		for(User1 user1 : users) {
			System.out.println(user1);
		}
		
		System.out.println("Select 완료...");
	}

}
