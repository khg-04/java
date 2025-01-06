package sub2;

/*
 * 날짜: 2024/12/31
 * 이름: 김효경
 * 내용: Java 자료형 실습
 */

public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형: byte, short, char, int, long -> 일반적으로 int를 많이 씀
		byte num1 = 127; // 8bit = 16byte
		short num2 = 32767;
		int num3 = 2147483647;
		long num4 = 922337203685477507L;
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("num4: " + num4);
				
		// 실수형: float, double -> 일반적으로 double을 많이 씀
		float var1 = 0.123456789f; // 소수점 8자리까지 출력
		double var2 = 0.123456789123456789; // 소수점 17자리까지 출력
		
		System.out.println("var1 " + var1);
		System.out.println("var2 " + var2);
		
		// 논리형: boolean
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1: " + data1);
		System.out.println("data2: " + data2);
		
		// 문자형: char -> 문자 하나하나 저장하기 때문에 단어 불가
		char c1 = 'A';
		char c2 = '가'; 
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		
		// 문자열: String
		String word1 = "A";
		String word2 = "가";
		String word3 = "Apple";
		String word4 = "겨울";
		
		System.out.println("word1: " + word1);
		System.out.println("word2: " + word2);
		System.out.println("word3: " + word3);
		System.out.println("word4: " + word4);
	}
}
