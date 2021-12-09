package 과제1;

import java.util.Scanner;

public class BookApplication {
	/* -----------------------------회원제 도서관 프로그램---------------------------------
	 * 1. 객체지향 [회원 클래스, 도서 클래스 ]
	 * -설계 : 필드, 생성자, 메소드
	 * 2. 객체는 배열에 저장
	 * - 회원클래스 배열 생성
	 * - 도서관리 배열
	 * 3. 회원만 프로그램 이용
	 * -중복 체크
	 * 3.1 회원기능 로그인전 : 1.로그인|2.회원가입|3.아이디 찾기|4.비밀번호 찾기 
	 * -중복체크
	 * 3.2 로그인시 : 1.도서목록|2.대여|3.반납|4.로그아웃
	 * - 도서목록 누르면 등록된 도서 출력
	 * - 대여 누르면 등록된 도서 대여
	 * - 반납 누르면 대여한 도서 반납
	 * 
	 * 4. 관리자[id : admin / pw:1234] 도서 등록 가능
	 * 4.1 관리자 로그인시 1.도서등록|2.도서목록|3.로그아웃
	 * - 관리자 정보 배열에 저장
	 * - 로그인 페이지에서 위 데이터로 들어가면 관리자
	 */
	// 1차시기
	public static Book[] books = new Book[100];
	public static Member[] members = new Member[100];
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		main_menu();
	}
	
	public static void main_menu() {
		
		while(true) {
			
			System.out.println("\t\t 회원제 도서관 프로그램");
			System.out.println("1.로그인|2.회원가입|3.아이디 찾기|4.비밀번호 찾기 | 선택 : "); int ch = scanner.nextInt();
			
			if(ch == 1) {
				
				String loginid = Member.login();
				
				if(loginid == null) {
					System.out.println("등록된 정보가 없습니다.");	
				}else if ( loginid.equals("admin")) {
					admin_menu();
				}else {
					member_menu(loginid);
				}
			}else if ( ch == 2 ) {
				Member.signup();
			}else if ( ch == 3 ) {
				Member.findid();
			}else if ( ch == 4 ) {
				Member.findpw();
			}
		}
	}
	
	public static void member_menu(String loginid) {
		while(true) {
			System.out.println("---------------회원 메뉴-----------------");
			System.out.println("1.도서목록|2.대여|3.반납|4.로그아웃"); int ch = scanner.nextInt();
			
			if(ch == 1) {
				Book.booklist();
			}else if ( ch == 2 ) {
				Book.rental(loginid);
			}else if ( ch == 3 ) {
				Book.bookreturn();
			}else if ( ch == 4 ) {
				System.out.println("로그아웃되었습니다.");
				return;
			}
		}
	}
	
	public static void admin_menu() {
		while(true) {
			System.out.println("--------------관리자 페이지----------------");
			System.out.print("1.도서등록|2.도서목록|3.로그아웃| 선택 : "); int ch = scanner.nextInt();
			
			if(ch==1) {
				Book.bookadd();
			}else if ( ch == 2) {
				Book.booklist();
			}else if ( ch == 3) {
				System.out.println("로그아웃되었습니다.");
				return;
			}
		}
	}
}
