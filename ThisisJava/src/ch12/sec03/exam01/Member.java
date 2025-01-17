package ch12.sec03.exam01;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override // Object의 equlas() 메소드 재정의
	public boolean equals(Object obj) {
		// obj가 Member 타입인지 검사하고 타입 변환 후 target 변수에 대입
		if(obj instanceof Member target) { 
			//id 문자열이 같은지 비교
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}

}
