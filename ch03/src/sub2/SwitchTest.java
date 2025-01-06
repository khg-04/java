package sub2;

import java.util.Scanner;

/*
 * 날짜: 2025/01/02
 * 이름: 김효경
 * 내용: Java switch문 실습하기
 */
public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("숫자 입력: ");
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); // 입력한 숫자를 number라는 변수에 저장
		System.out.println("입력 숫자: " + number);
		
		// 조건의 값의 결과에 따라 case별 실행흐름으로 분기
		switch(number % 2) {
		
		case 0:
			System.out.println("number은 짝수");
			break;
		case 1:
			System.out.println("number은 홀수");
			break;
		default:
			System.out.println("number은 숫자가 아님");
			break;
		}
	}

}
