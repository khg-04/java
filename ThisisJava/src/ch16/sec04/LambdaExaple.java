package ch16.sec04;

public class LambdaExaple {
	public static void main(String[] args) {
		
		Person person = new Person();
		
		//실행문이 두 개 이상일 경우
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
	}

}
