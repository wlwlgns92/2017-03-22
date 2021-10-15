package Day12;

import java.util.Scanner;

import Day11.Member;

public class 로그인회원가입 {
	// 설정 main 밖에 선언해야 다른클래스에서 사용가능
	public static Scanner scanner = new Scanner(System.in);
	public static 회원가입[] Members = new 회원가입[100];
	
	
		public static void main(String[] args) throws Exception {

			// 1. 입력받기 - > 2. 객체생성 -> 3. 파일쓰기[out]
			// 주의점 : 회원구분, 회원당 필드구분,
		
			
			while(true) { 

				System.out.println("-----------------로그인/회원가입 프로그램--------------");
				System.out.println("1.로그인 | 2.회원가입");
				System.out.print("선택 > " ); int ch = scanner.nextInt();
				
				if(ch==1) {	}
				if(ch==2) {회원가입.signup(); }
				
			}
				
		}
}
