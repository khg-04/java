package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		System.out.println("b: " + b);
		int y = -b;
		System.out.println("y: " + y);
		
		int p = 1;
		int q = 1;
		int result1 = ++p + 10;
		int result2 = q++ + 10;
		System.out.println("p :" +p);
		System.out.println("q :" +q);
		
		System.out.println("result1: " +result1);
		System.out.println("result2: " +result2);
		
	}

}
