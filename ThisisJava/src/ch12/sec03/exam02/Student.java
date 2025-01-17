package ch12.sec03.exam02;

public class Student {
	private int num;
	private String name;
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() { return num;}
	public String getName() { return name;}

	@Override
	public int hashCode() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(name.hashCode());
		int hashCode = num + name.hashCode(); // 학생 번호와 이름 해시코드를 합친 새로운 해시코드
		System.out.println("return hashCode: " + hashCode);
		return hashCode; // 새로운 해시코드 리턴
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(num == target.getNum() && name.equals(target.getName())) {
				return true;
			}
		}return false;
	}

}
