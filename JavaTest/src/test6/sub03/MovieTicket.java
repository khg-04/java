package test6.sub03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		
	}
	
	public MovieTicket(boolean isBooked) {
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if(isBooked == false) {
			System.out.println(movieTitle + "," + screenTime + "," + seatNumber + "," + "예매 완료");
			this.isBooked = true;
		}else {
			System.err.println("이미 예약됨");
		}
	}
	
	public void cancelBooking() {
		if(isBooked == true) {
			System.out.println(movieTitle + "," + screenTime + "," + seatNumber + "," + "취소 완료");
			this.isBooked = false;
		}else {
			System.err.println("아직 예매 안됨");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화이름: " + movieTitle);
		System.out.println("상영시간: " + screenTime);
		System.out.println("좌석번호: " + seatNumber);
		System.out.println("예매여부: " + (isBooked ? "Yes":"No"));
	}

}
