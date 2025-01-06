package ch01;

/*
 * 날짜: 2024/12/31
 * 이름: 김효경
 * 내용: 출력 테스트
 */

public class PrintTest {

	public static void main(String[] args) {
		
		// 기본출력
		System.out.println("Hello Java!"); // 자바의 기본 출력
		System.out.println("Hello Korea!");
		System.out.println("Hello Busan!");
		
		// 한줄출력
		System.out.print("Welcome"); // ln: 줄바꿈(개행) 처리가 안 되기 때문에 출력 문자열이 이어서 출력됨
		System.out.print("Java!");
			//result: WelcomeJava!
		System.out.print("Spring");
		
		// 개행출력
		System.out.println(); //줄바꿈(개행)
		System.out.print("Greening\n"); // \n: 이스케이프문자로 줄바꿈(개행) 처리 
		System.out.print("Java");
		
	}
}
