package sub5;

import java.io.File;
import java.io.IOException;

/*
 * 날짜: 2025/01/16
 * 이름: 김효경
 * 내용: Java File 실습하기
 */
public class FileTest {
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\lotte6\\Desktop\\Test.txt";
		String path2 = "C:\\Users\\lotte6\\Desktop\\Test";
		
		// 파일 객체 생성
		File f1 = new File(path1);
		File f2 = new File(path2);
		
		try {
			f1.createNewFile();
			f2.mkdir();
			
			System.out.println("f1 존재여부: " + f1.exists());
			System.out.println("f2 존재여부: " + f2.exists());
			System.out.println("f1 파일여부: " + f1.isFile());
			System.out.println("f2 파일여부: " + f2.isFile());
			System.out.println("f1 디렉토리여부: " + f1.isDirectory());
			System.out.println("f2 디렉토리여부: " + f2.isDirectory());
			System.out.println("f1 파일이름: " + f1.getName());
			System.out.println("f2 파일이름: " + f2.getName());
			System.out.println("f1 파일경로: " + f1.getParent());
			System.out.println("f2 파일경로: " + f2.getParent());
			System.out.println("f1 파일절대경로: " + f1.getAbsolutePath());
			System.out.println("f2 파일절대경로: " + f2.getAbsolutePath());
			
			f1.delete(); // 파일 삭제
			f2.delete();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
