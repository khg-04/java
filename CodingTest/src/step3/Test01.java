package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i=1 ; i <= 9 ; i++) {
			int result = N * i;
			System.out.println(N + " * " + i + " = " + result);
		}
	}

}
