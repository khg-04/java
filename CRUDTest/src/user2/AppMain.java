package user2;

import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2025/01/27
 * 이름 : 김효경
 * 내용 : Java CRUD 실습하기
 */
public class AppMain {
	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("User2 CRUD 실습");
		System.out.println("-------------------");
		
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		User2Dao dao = User2Dao.getInstance();
		
		while(isRunning) {
			System.out.println("0:종료, 1:입력, 2:조회, 3:검색, 4:수정, 5:삭제");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			switch (answer) {
			case 0:
				// 종료
				isRunning = false;
				break;
			case 1:
				// 입력
				User2 user = inputUser(sc);
				dao.insertUser2(user);
				System.out.println("INSERT 완료");
				break;
			case 2:
				// 조회
				List<User2> user2List = dao.selectUser2List();
				for(User2 user2 : user2List) {
					System.out.println(user2);
				}
				break;
			case 3:
				// 검색
				String uid = findUser(sc);
				User2 user2 = dao.selectUser2(uid);
				
				if(user2 != null) {
					System.out.println(user2);
				}else
					System.out.println("해당 사용자를 찾을 수 없습니다.");
				break;
			case 4:
				// 수정
				User2 modifiedUser = modifyUser(sc);
				dao.updateUser2(modifiedUser);
				System.out.println("해당 사용자 수정 완료");
				break;
			case 5:
				// 삭제
				String removerdUser = removeUser(sc);
				dao.deleteUser2(removerdUser);
				System.out.println("해당 사용자 삭제 완료");
				break;
			}
		}
	} // main end
	public static User2 inputUser(Scanner sc) {
		sc.nextLine();
		System.out.print("아이디 입력: ");
		String uid = sc.nextLine();
		
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		
		System.out.print("생년월일 입력: ");
		String birth = sc.nextLine();
		
		System.out.print("주소 입력: ");
		String addr = sc.nextLine();
		
		User2 user = new User2(uid, name, birth, addr);
		return user;
	}
	
	public static String findUser(Scanner sc) {
		sc.nextLine();
		System.out.println("검색할 아이디 입력: ");
		String uid = sc.nextLine();
		
		return uid;
	}
	
	public static User2 modifyUser(Scanner sc) {
		sc.nextLine();
		System.out.print("수정할 아이디 입력: ");
		String uid = sc.nextLine();
		
		System.out.print("수정할 이름 입력: ");
		String name = sc.nextLine();
		
		System.out.print("수정할 생년월일 입력: ");
		String birth = sc.nextLine();
		
		System.out.print("수정할 주소 입력: ");
		String addr = sc.nextLine();
		
		User2 user = new User2(uid, name, birth, addr);
		return user;
	}
	
	public static String removeUser(Scanner sc) {
		sc.nextLine();
		System.out.print("삭제할 아이디 입력: ");
		String uid = sc.nextLine();
		return uid;
	}

}
