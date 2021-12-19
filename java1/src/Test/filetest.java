package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class filetest {
		// 파일 3차시기
	public static void main(String[] args) {
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/82108/git/2017-03-22/java1/src/Test/test.txt");
			String 문자열 = "조지훈입니다.";
			fileOutputStream.write(문자열.getBytes());
			
			byte[] bs = new byte[1024];
			FileInputStream fileInputStream = new FileInputStream("C:/Users/82108/git/2017-03-22/java1/src/Test/test.txt");
			fileInputStream.read(bs);
			String 형변환1 = new String(bs);
			System.out.println("작성한 문자는 : " + 형변환1);
			
			
			while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("문자를 입력해 주세요 : "); String 입력문자 = scanner.next(); 
			입력문자 = 입력문자 + "\n";
			fileOutputStream.write(입력문자.getBytes());
			
			fileInputStream.read(bs);
			String 형변환2 = new String(bs);
			System.out.println("입력한 문자는 : " + 형변환2);
			
			}
			
		} catch (Exception e) {}
	}
}
