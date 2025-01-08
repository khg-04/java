package step1;

import java.util.Scanner;

public class Test02 {
	
	
	
	public static void main(String[] args) {
		
		Scanner input_number = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("첫번째 숫자 입력: ");
		A = input_number.nextInt();
		System.out.println("두번째 숫자 입력: ");
		B = input_number.nextInt();
		
		int result = A + B;
		
		System.out.println("결과: " + result);
		
	}

}
//import java.util.Scanner;

//public class Test02 {
	
//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		System.out.println(a + b);
//	}
//}