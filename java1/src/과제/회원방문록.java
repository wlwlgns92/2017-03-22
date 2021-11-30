package 과제;

import java.util.Scanner;

public class 회원방문록 {
	// 회원제 게시판 
	// 1. 아이디와 비밀번호를 입력받아 회원가입
	// 2. 회원가입시 입력한 아이디와 비밀번호로 
	// 3. 로그인하면 게시판 기능 활성화
	// 4. 1.방문록쓰기 | 2.방문록확인 | 3.로그아웃
	
	public static void main(String[] args) {
		String[][] 회원정보 = new String[100][2];
		String[][] 게시판 = new String[100][2];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//
			System.out.println("회원제 게시판");
			System.out.print("1.회원가입 | 2.로그인 | 선택 : "); int ch = scanner.nextInt();
			
			switch (ch) {
			case 1:
				
				System.out.print("사용하실 아이디를 입력해 주세요 : "); String id = scanner.next();
				System.out.print("사용하실 비밀번호를 입력해 주세요 : "); String pw = scanner.next();
				
				boolean idcheck = true;
				for(int i = 0; i < 회원정보.length; i++) {
					if(회원정보[i][0] != null && 회원정보[i][0].equals(id)) {
						System.out.println("이미 사용중인 아이디 입니다.");
						idcheck = false;
						break;
					}
				}
				if(idcheck) { 
					for(int i = 0; i < 회원정보.length; i++) {
						if(회원정보[i][0] == null) {
							회원정보[i][0] = id; 회원정보[i][1] = pw; 
							break;
						}
					}
				}
				break;

			case 2:
				
				System.out.print("아이디를 입력해 주세요 : "); String id2 = scanner.next();
				System.out.print("비밀번호를 입력해 주세요 : "); String pw2 = scanner.next();
				
				boolean check = true;
				for(int i = 0; i < 회원정보.length; i++) {
					if(회원정보[i][0] != null && 회원정보[i][0].equals(id2) && 회원정보[i][1].equals(pw2)) {
						System.out.println("로그인 성공 ");
						System.out.println();
						while(true) {
							
							System.out.println("게시판 메뉴");
							System.out.print("1.방문록쓰기 | 2.방문록확인 | 3.로그아웃 | 선택 : "); int ch2 = scanner.nextInt();
							
							if( ch2 == 1 ) {
								scanner.nextLine();
								System.out.print("방문록 내용을 입력해 주세요 : "); String 내용 = scanner.nextLine();
								for(int j = 0; j < 게시판.length; j++) {
									if(게시판[j][0] == null ) {
										게시판[j][0] = id2; 게시판[j][1] = 내용;
										System.out.println(" 방문록이 등록되었습니다.");
										break;
									}
								}
							}
							else if ( ch2 == 2 ) {
								System.out.println("방문록 확인 ");
								System.out.printf("%10s \t %s \n", "작성자" , "내용");
								for(int j = 0; j < 게시판.length; j++) {
									if(게시판[j][0] == null) { break; }
									System.out.printf("%10s \t %s \n", 게시판[j][0] , 게시판[j][1]);
								}
							}
							else if( ch2 == 3 ) {
								System.out.println("로그아웃되었습니다.");
								break;
							}
							else { System.out.println("잘못된 입력입니다."); }
						}
						check = false;
						break;
					}
					if(check) { System.out.println("존재하지 않는 정보입니다."); } 
					break;
				}
			} 

		}
	} // me 
}// ce
