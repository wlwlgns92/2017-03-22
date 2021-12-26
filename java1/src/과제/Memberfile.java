package 과제;

import java.util.Scanner;



public class Memberfile {
	
	public static Scanner scanner = new Scanner(System.in); // public static 을 붙여 다른 클래스에서 사용가능하게 한다.
	public static Member[] members = new Member[100];
	public static String[] login = new String[100];
	public static void main(String[] args) {
		while(true) {
			
			Member member = new Member();
			
			System.out.println("---------------멤버멤버-------------");
			System.out.println("1.회원가입 | 2.로그인");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				member.signup();
			}else if ( ch == 2 ) {
				member.login();
			}
		}
	}
}
