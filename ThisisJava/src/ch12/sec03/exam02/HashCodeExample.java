package ch12.sec03.exam02;

public class HashCodeExample {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());
		
		if(s1.hashCode() == s2.hashCode()) { //해시코드가 동일한지 검사
			System.out.println("---------------");
			if(s1.equals(s2)) { // 데이터가 동일한지 검사
				System.out.println("동등 객체임");
			}else {
				System.err.println("데이터가 다르므로 동등 객체가 아님");
			}
		} else {
			System.out.println("해시코드가 다르므로 등등 객체가 아님");
		}
	}

}
