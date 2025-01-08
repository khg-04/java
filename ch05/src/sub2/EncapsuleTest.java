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
		
		/*
		 도서관 관리 시스템의 일부로 Book 클래스를 정의하세요 이 클래스는 다음 요구사항을 충족해야 합니다.
		 
		 <속성>
		 - title(String): 책 제목
		 - author(String): 저자 이름
		 - isbn(String): ISBN 번호
		 - availavleCopies(int): 이용 가능한 복사본 수
		 
		 <생성자>
		 - 모든 인스턴스 변수를 초기화하는 생성자
		 
		 <메서드>
		 borrowBook()
		 - 이용 가능한 복사본이 있으면 availableCopies를 1 감소 시키고 true를 반환
		 - 이용 가능한 복사본이 없으면 false를 반환
		 
		 returnBook()
		 - availableCopies를 1 증가
		 
		 show()
		 - 모든 멤버 변수 값을 출력
		 */
		Book book1 = new Book("삼국지", "나관중", "10001", 10);
		book1.show();
		
		boolean isOk = book1.borrowBook();
		
		if(isOk) {
			System.out.println("도서 대출 성공");
		}else {
			System.out.println("도서 대출 실패");
		}
		
		book1.show();
		
		Book book2 = new Book("이것이 자바다", "신용권", "10002", 0);
		book2.show();
		
		if(book2.borrowBook()) {
			System.out.println(book2.getTitle() + "도서 대출 성공");
		}else {
			System.out.println(book2.getTitle() + "도서 대출 실패");
		}
		
		/*
		 Movie 클래스
		 */
		
		Movie mo1 = new Movie("대충영화", "대충저자", 8.0, 10);
		mo1.show();
		
		if(mo1.reserbeSeat()) {
			System.out.println("예약 성공");
		}else {
			System.out.println("예약 실패");
		}
		mo1.show();
		
		Movie mo2 = new Movie("타이타닉", "제임스", 8.5, 0);
		if(mo2.reserbeSeat()) {
			System.out.println("예약 성공");
		}else {
			System.out.println("예약 실패");
		}
		mo2.show();
	}

}
