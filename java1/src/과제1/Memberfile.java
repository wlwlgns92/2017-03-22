package 과제1;

import java.util.Scanner;

public class Memberfile {
	
	
	public static Scanner scanner = new Scanner(System.in);
	public static Member[] members = new Member[100];
	
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.print("1.회원가입 | 2.로그인 선택 :"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				Member.signup();
				
			}
			if ( ch == 2) {
				Member.login();
			}
		}
	}
}
