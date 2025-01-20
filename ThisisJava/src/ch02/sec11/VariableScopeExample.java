package ch02.sec11;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			System.out.println(v2);
			// 중괄호 내에서 선언된 변수는 해당 중괄호 블록 내에서만 사용이 가능하고 밖에서는 사용이 불가
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}
		//int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		//System.out.println(v3);
	}

}
