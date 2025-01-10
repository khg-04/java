package test3;

/*
 * 날짜: 2025/01/01
 * 이름: 김효경
 * 내용: 다형성 연습문제
 */
??? class Shape {
	public abstract void draw();
}

class Triangle extends ??? {
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends ??? {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}
public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = bew Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	
	public void draw(??? obj) {
		obj.draw();
	}

}
