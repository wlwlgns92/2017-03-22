package 과제;

import java.util.Scanner;

public class 회원방문록 {
	
	public static void main(String[] args) {
		
		String[][] 회원정보 = new String[100][2];
		String[][] 게시판 = new String[100][2];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("---------로그인화면 ----------");
			System.out.println("1.회원가입 | 2. 로그인"); 
			System.out.print("선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				System.out.print("사용하실 아이디를 입력해 주세요 : "); String id = scanner.next();
				System.out.print("사용하실 비밀번호를 입력해 주세요 : "); String pw = scanner.next();
				
				boolean idcheck = true;
				for(int i = 0; i < 회원정보.length; i++) {
					if( 회원정보[i][0] !=null && 회원정보[i][0].equals(id)) {
						System.out.println("사용중인 아이디 입니다.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) {
					for(int i = 0; i < 회원정보.length; i++) {
						if(회원정보[i][0] == null) {
							회원정보[i][0] = id; 회원정보[i][1] = pw;
							System.out.println("회원가입완료");
							break;
						}
					}
				}
			}
			if(ch == 2) {
				System.out.print("아이디를 입력해주세요 : "); String id2 = scanner.next();
				System.out.print("비밀번호를 입력해 주세요 : "); String pw2 = scanner.next();
				
				for(int i =0; i < 회원정보.length; i ++) {
					if(회원정보[i][0].equals(id2) && 회원정보[i][1].equals(pw2) && 회원정보[i][0] != null) {
						System.out.println("로그인 성공");
					}
				}
				
			}
		}
	}
}
