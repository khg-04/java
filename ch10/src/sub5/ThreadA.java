package sub5;

public class ThreadA extends Thread{
	private Workobject workobject;
	
	public ThreadA(Workobject workobject) { // 공유 작업 객체를 받음
		setName("ThreadA"); // 스레드 이름 변경
		this.workobject = workobject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workobject.methodA(); // 동기화 메소드 호출
		}
	}

}
