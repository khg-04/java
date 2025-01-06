package sub3;

/*
 * 날짜: 2024/12/31
 * 이름: 김효경
 * 내용: Java 연산자 실습
 */

public class OperatorTest {
	
	public static void main(String[] args) {
		
		// 산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2; // 몫 출력
		int result5 = num4 % num3; // 나머지 출력
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		// 증감연산자
		int num = 0;
		System.out.println("num_1: " + num);

		num++; // 변수값을 1 증가(counting) 
		System.out.println("num_2: " + num);
		
		++num; // 증감연산자는 변수 앞에 붙어도 1 증가
		System.out.println("num_3: " + num);
		
		num--; // 변수값을 1 감소(discounting)
		System.out.println("num_4: " + num);
		
		--num;
		System.out.println("num_5: " + num);
		
		// 복합대입연산자
		int n1 = 1, n2 = 2, n3 =3, n4 =4;
		
		n1 += 1; // 기존에 할당된 변수 값에 지정값을 더함
		n2 -= 2;
		n3 *= 3;
		n4 /= 4;
		
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
				
		// 비교연산자 -> 참거짓 판단을 위해 boolean 사용
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2; // var1은 var2보다 작다
		boolean rs2 = var1 < var2; // var1은 var2보다 크다
		boolean rs3 = var1 >= var2; // var1은 var2보다 크거나 같다
		boolean rs4 = var1 <= var2; // var1은 var2보다 작거나 같다
		boolean rs5 = var1 == var2; // var1와 var2는 서로 같다
		boolean rs6 = var1 != var2; // var1와 var2는 서로 다르다
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs1: " + rs2);
		System.out.println("rs1: " + rs3);
		System.out.println("rs1: " + rs4);
		System.out.println("rs1: " + rs5);
		System.out.println("rs1: " + rs6);
				
		
		// 논리연산자
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // var3가 3보다 크고 그리고(&&) var4가 3보다 크다.
		boolean res2 = (var3 > 2) && (var4 > 3); // var3가 2보다 크고 그리고(&&) var4가 3보다 크다.
		boolean res3 = (var3 > 3) || (var4 > 3); // var3가 2보다 크거나 또는(||) var4가 3보다 크다.
		boolean res4 = (var3 > 3) || (var4 > 5); // var3가 2보다 크거나 또는(||) var4가 5보다 크다.
		boolean res5 = !(var3 > var4); // var3은 var4보다 크지 않다
		
		System.out.println("res1: " + res1);
		System.out.println("res2: " + res2);
		System.out.println("res3: " + res3);
		System.out.println("res4: " + res4);
		System.out.println("res5: " + res5);
	}

}
