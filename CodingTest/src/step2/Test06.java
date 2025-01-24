package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		sc.close();
		
		int total_min = min + time;
		boolean vail = true;
		
		while(vail) {
			if(total_min >= 60) {
				hour++;
				total_min = total_min - 60;
				if(hour == 24) {
					hour = 0;
				}
			} else {
				vail = false;
			
			System.out.println(hour + " " + total_min);
			}
		}
	}

}
