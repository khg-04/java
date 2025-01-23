package ch04.sec04;

import java.util.Scanner;

public class SumFrom1To100Example {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 case 선택(1번 or 2번)");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			int sum = 0;
			int i;
			
			for(i=1; i<=100; i++) {
				sum += i;
			}
			System.out.println("case1: " + sum);
			break;
			
			
		case 2:
			int sum2 = 0;
			int j = 1;
			while(j<=100) {
				sum2 += j;
				j++;
				
			}
			System.out.println("case2: " + sum2);
			break;
			
		}

		
		
		
	
	}

}
