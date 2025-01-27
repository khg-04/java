package test6.sub05;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명: " + subName);
		for(int i=0 ; i <= students.length; i++) {
			System.out.print("수강생: " + students[i]);
		}
	}
	
	public String getsubName() {
		return subName;
	}
}
