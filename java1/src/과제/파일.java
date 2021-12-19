package 과제;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class 파일 {

	public static void main(String[] args)  { // 던지기
		
		// 해당 파일이 없으면 파일 생성 
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/82108/git/2017-03-22/java1/src/과제/file.txt");
			
			String 문자열 = "문서입니다."; // 변수에 문자열 대입
			fileOutputStream.write(문자열.getBytes()); // 변수에 담긴 값을 바이트로 내보내기 
			
			byte[] bytes = new byte[1024]; // 바이트배열
			// 해당 파일을 읽어오기 
			FileInputStream fileInputStream = new FileInputStream("C:/Users/82108/git/2017-03-22/java1/src/과제/file.txt");
			fileInputStream.read(bytes); // 읽어온 파일을 바이트 배열에 저장
			
			String readfile = new String(bytes); // 읽어온 바이트배열을 String 타입으로 변환
			System.out.println("파일 내용은 : " + readfile); // 출력
		
			
			Scanner scanner = new Scanner(System.in); // 입력객체
			
			while(true) { // 무한루프
				
				System.out.println("입력할 데이터 : "); String 입력데이터 = scanner.next(); // 입력한 문자열 변수에 대입
				입력데이터 = 입력데이터+"\n"; // 변수값에 + \n
				fileOutputStream.write(입력데이터.getBytes()); // 변수의 값 바이트로 변환하여 txt파일에 저장하기
				
				fileInputStream.read(bytes); // 파일을 불러와 바이트 배열에 대입
				String 읽은파일 = new String(bytes); // 바이트 배열을 문자열로 변환해 변수에 값 대입
				System.out.println("작성한 파일 내용은 : " + 읽은파일); // 출력
				
			}
		} catch (Exception e) {System.out.println("예외 : "+e);}
		
		
		
		
		
	}
}
