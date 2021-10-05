package Day05;

import java.util.Scanner;

public class Day05_2_회원제방문록 {
	
	public static void main(String[] args) {
		// 선택을 하기위한 입력객체 선언
		Scanner scanner = new Scanner(System.in);
		// 1. 회원 100명 저장하는 방법
		String[][] 회원목록 = new String[100][2]; // 100 * 2 = 200칸
		String[][]방문록 = new String[100][2]; // 방문록 100개 [contents, writer] 저장하는 방법 선언
		
		// 2. 메뉴 => 메뉴는 계속 반복실행 = 무한루프 [while]
		
		while(true) {
			System.out.println("\t- 회원제 방문록 - ");
			System.out.println("----------------------------------");
			System.out.print("\t1. 회원가입 2. 로그인 : "); int ch = scanner.nextInt();
			
			// 3. 입력에 따른 값 제어
			switch(ch) {
			case 1 :
				System.out.println(" -회원가입 페이지"); 
				System.out.println(" id : "); String id = scanner.next();
				System.out.println(" Password : "); String pw = scanner.next();
				
				//id 중복체크 [ 모든 배열내 인덱스에 접근해서 동일한 아이디가 있는지 체크]
				boolean idcheck=true;
				for(int i = 0; i < 회원목록.length; i++) {
					// 회원목록.length : 배열의 가로길이 = 100
					if (회원목록[i][0] != null && 회원목록[i][0].equals(id)) { // i번쨰 id와 동일하면
						System.out.println(" 중복된 아이디가 존재합니다.");
						idcheck = false;
						break; // 중복찾기 for문 종료
					}
				}
				
				
				// 중복체크 변수가 true 경우 배열내 빈 공간에 저장
				if(idcheck) {
					for(int i = 0; i <회원목록.length; i++) {
						if(회원목록[i][0] == null) { //i번쨰가 공백이면
							회원목록[i][0] = id; 회원목록[i][1]= pw;
							System.out.println("회원가입이 완료되었습니다.");
							break;
						}
					}
						
				}
				break;
			case 2 :
				System.out.println(" -로그인 페이지");
				// 입력 -> 저장 -> 배열내[]에서 비교 (for, if)
				System.out.println(" id : "); String id1 = scanner.next();
				System.out.println(" Password : "); String pw1 = scanner.next();
				// 배열내 저장된 아이디와 패스워드가 존재하는지 -> 존재하면 로그인 성공
					//for문을 이용한 모든 인덱스에 접근해서 하나씩 비교
				
				boolean check = true;
				for(int i = 0; i < 회원목록.length; i++) {
					if(회원목록[i][0] != null && 
							회원목록[i][0].equals(id1) &&
							회원목록[i][1].equals(pw1)) {
						System.out.println("로그인에 성공하셨습니다.");
						//////로그인 성공시 메뉴/////////
						while(true) { //회원메뉴 무한루프
							System.out.println();
							System.out.println("1. 방문록 작성 2. 방문록 확인 3. 로그아웃 \n선택: ");
							int ch2 = scanner.nextInt();
							
							if(ch2 == 1) {
								scanner.nextLine(); // nextLine의 문제 해결
								System.out.println(("방문록 내용 : ")); String 내용 = scanner.nextLine();
								//방문록 배열내 빈공간을 찾아서 내용과 로그인된 아이디를 저장
								for(int j =0; j < 방문록.length; j++) {
									if(방문록[j][0] == null) { // j번째 인덱스의 값이 공백[null]이면
										방문록[j][0] = 내용; 방문록[j][1] = id1;
										System.out.println(" >>> 방문록 등록");
										break;
									}
								}
								
								
							}
							else if (ch2 == 2) {
								System.out.println("-------방문록 목록.");
								System.out.printf("%10s \t %s \n", "작성자", "내용");
								// 공백을 제외한 모든 내용 출력
								for (int j= 0; j<방문록.length; j++) {
									if( 방문록[j][0] == null) {break;}
									
									System.out.printf("%10s \t %s \n", 방문록[j][1], 방문록[j][0]);
								}
							
							}
							else if (ch2 == 3) {
								System.out.println("-------로그아웃 되었습니다.");
								break;
							}
							else System.out.println("알 수 없는 행동입니다.");
						}
						
						check = false;
						break;
					}
				}
				//로그인 실패시
				if(check) { System.out.println(" 동일한 회원정보가 없습니다.");}
				 break;
			
			}//se
			
		}//we
	}//me
}//ce
