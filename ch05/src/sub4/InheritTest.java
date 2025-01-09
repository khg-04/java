package sub4;

/*
 * 날짜: 2025/01/09
 * 이름: 김효경
 * 내용: Java 클래스 상속 실습하기
 */

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent {
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2); // 부모클래스 생성자 호출
	}
}

public class InheritTest {

}
