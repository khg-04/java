package ch16.sec05.exam01;

@FunctionalInterface
interface Calcuable {
	double calc(double x, double y);
}

class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과" + result);
	}
}

class Computer {
	public static double staticMethod(double x, double y) {
		return x * y;
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Perso
	}

}
