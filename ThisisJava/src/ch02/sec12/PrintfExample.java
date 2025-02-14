package ch02.sec12;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value); //6자리 정수, 왼쪽 빈자리 공백
		System.out.printf("상품의 가격: %-6d원\n", value); //6자리 정수, 오른쪽 빈자리 공백
		System.out.printf("상품의 가격: %06d원\n", value); //6자리 정수, 왼쪽 빈자리 0으로 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %010.2f\n", 10, area);
		// %10.2f: 정수7자리+소수점_소수 2자리, 왼쪽 빈자리 공백
		// %010.2f: 정수7자리+소수점_소수 2자리, 왼쪽 빈자리 0으로 채움
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n |", 1, name, job);
	}
}
