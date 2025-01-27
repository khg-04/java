package test6.sub05;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subjects) {
		System.out.println(name + "-" + subjects.getsubName() + "과목 신청완료");
	}
	
	public void setScore(Subject subjects, int socres) {
		System.out.println(name + "-" + subjects.getsubName() + "점수 입력완료");
	}
	
	public void printStudentInfo() {
		System.out.println("학생명: " + name);
		System.out.println("아이디: " + studentId);
		System.out.println("성적");
		
		System.out.println("-" + subjects + ": " + scores);
	}
	
	public String getName() {
		return name;
	}

}
