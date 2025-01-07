package sub2;

/**
 * 날짜: 2025/01/07
 * 이름: 김효경
 * 내용: Java 클래스 캡슐화 실습하기
 */
public class EncapsuleTest {
	public static void main(String[] args) {
		
		// Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);
		
		// 캡슐화된 속성은 외부에서 참조할 수 없음(private)
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 10;
		
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		/*
		<출력>
		차랑명: 아반데
		차량색: 검정
		현재속도: 20
		 */
		Car avante = new Car("아반데", "검정", 10);
		avante.speedUp(40);
		avante.speedDown(30);
		avante.show();
		
		avante.setColor("흰색"); // setter를 이용해 속성 수정
		avante.show();
		
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		은행명: 국민은행
		계좌번호: 110-11-1021
		입금주: 김유신
		현재잔액: 10000
		 */
		Account kb = new Account("국민은행", "110-12-1101", "김유신", 10000);		
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.show();
		
		kb.setName("김유진");
		kb.show();
		kb.setBank("우리은행");
		kb.show();
		/*
		 Account 객체 생성 초기화(캡슐화 적용)
		 <출력>
		은행명: 우리은행
		계좌번호: 110-11-1021
		입금주: 김춘추
		현재잔액: 15000
		 */
	}

}
