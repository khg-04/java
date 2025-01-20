package sub3;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// 스레드 간의 경합(Race Condition)을 해결하기 위해 상호배제(Mutext) 처리
	public synchronized void setNum() {
		
		// sunchronized 동기화 블럭으로 임계영역 설정(동기화 작업 처리: 순서대로 처리)
		num++;
	}
}