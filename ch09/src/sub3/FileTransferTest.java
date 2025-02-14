package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜: 2025/01/16
 * 이름: 김효경
 * 내용: Java 파일 입출력 버퍼 스트림 실습하기
 */

public class FileTransferTest {
	public static void main(String[] args) {
		
		// 파일 경로 설정
		String source = "C:\\Users\\lotte6\\Desktop\\Sample.tif"; // 입력 스트림
		String target = "C:\\Users\\lotte6\\Desktop\\Sample2.tif"; // 출력 스트림
	
			
		// 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 파일복사
			fis.transferTo(fos);
			
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료...");
	}

}
