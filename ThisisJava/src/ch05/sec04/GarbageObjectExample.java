package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "travel";
		hobby = null;
		
		String kind1 = "car";
		String kind2 = kind1;
		kind1 = null;
		System.out.println("kind1 = " + kind1);
		System.out.println("kind2 = " + kind2);
	}

}
