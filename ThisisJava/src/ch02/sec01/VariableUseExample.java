package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3;
		int minuate = 5;
		System.out.println(hour + "시간 " + minuate + "분");
		
		int totalMinuate = (hour*60) + minuate;
		System.out.println("총 " + totalMinuate + "분");
	}
}
