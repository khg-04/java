package sub3;

// Car 클래스 정의(설계)
public class Car {
	
	//속성(멤버 변수) - 클래스 속성은 캡슐화를 위해 무조건 private 선언
	private String name;
	private String color;
	private int speed;	
	
	// 클래스 변수(정적변수): 객체 생성 없이 클래스 이름으로 직접 참조
	public static int count; // static을 빼면 호출 불가
	
		// 위에 있는 3개의 변수는 인스턴스 변수
		// static 변수는 예외
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 클래스 이름과 동일한 반환 타입이 없는 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;	
		count++;
	}
	
	//기능(멤버 메서드) - 클래스 기능은 무조건 public 선언
	
	// // 클래스 변수(정적변수): 객체 생성 없이 클래스 이름으로 직접 참조
	public static int getCount() {
		return count;
	}
	
	public void speedUp(int speed) {
		// 속성 speed에 매개변수값 대입
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차랑명: " + this.name);
		System.out.println("차량색: " + this.color);
		System.out.println("현재속도: " + this.speed);
	}
	
	// Getter, Setter 정의(옵션) - 캡슐화된 속성을 수정하기 위한 메서드
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
