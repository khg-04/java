package sub5;

/*
 * 날짜: 2024/01/20
 * 이름: 김효경
 * 내용: Java 스레드 제어 실습하기
 */
public class ThreadControlTest {
	public static void main(String[] args) {
		Workobject workobject = new Workobject(); // 공유 작업 객체 생성
		
		// 작업 스레드 생성
		ThreadA threadA = new ThreadA(workobject);
		ThreadB threadB = new ThreadB(workobject);
		
		// 작업 스레드 실행
		threadA.start();
		threadB.start();
	}
}