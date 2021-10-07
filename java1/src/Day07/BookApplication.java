package Day07;

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
	 * 3.1 회원기능 로그인전 : 1.로그인|2.회원가입|3.아이디|4.비밀번호
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
	public static Member[] members = new Member[100];
	public static Book[] books = new Book[100];
	public static Scanner scanner = new Scanner(System.in);
	
	//메인 메소드 = > 시작지점
	public static void main(String[] args) {
		
		main_menu();//메소드 호출

	}
	//1. 메인메뉴 메소드
	public static void main_menu() {
		
		while(true) {
			System.out.println("-----------회원제 도서관 프로그램----------");
			System.out.println("1.로그인|2.회원가입|3.아이디찾기|4.비밀번호찾기");
			System.out.println("--------------------------------------");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			//다른 캘래스 메소드 호출 방법
				// 1. 객체 생성후 객채로부터 멤버 접근
				// 2. 해당 메소드 static
			if(ch==1) { 
				String loginid = Member.login();
				//로그인메소드 실행
					// login 메소드의 반환값에 따른 제어
					//0. 로그인 실패				
						if(loginid == null) {
							System.out.println(" 등록된 정보가 없습니다.");
						}
					//1. 관리자
						else if(loginid.equals("admin")) {admin_menu();	}	
					//2. 일반회원
						else {member_menu(loginid);}
			}
			if(ch==2) { 
				Member.signup();
				//회원가입메소드 실행
			}
			if(ch==3) { String findid= Member.findid();
			//아이디 찾기 메소드 실행
			}
			if(ch==4) { String findpw= Member.findpw();
				//비밀번호 찾기 메소드 실행
			}

		}
	}
	//2. 로그인시 메뉴 메소드
	public static void member_menu(String loginid) {
		Book book =new Book();
		while(true) {
			System.out.println("-----------------로그인 메뉴----------------");
			System.out.println("\t1.도서목록|2.대여|3.반납|4.로그아웃\t");
			System.out.print("선택 >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.book_list(); }
			if(ch==2) {book.book_rental(loginid); }
			if(ch==3) {book.book_return(loginid); }
			if(ch==4) {System.out.println("로그아웃 되었습니다."); return; }
		}
	}
	//3. 관리자 메뉴 메소드
	public static void admin_menu() {
		// Book 임시객체 : 메소드 호출용
		Book book =new Book();
		
		while(true) {
			System.out.println("-----------------관리자 메뉴----------------");
			System.out.println("\t1.도서등록|2.도서목록|3.로그아웃\t");
			System.out.print("선택 >> : "); int ch = scanner.nextInt();
			
			if(ch==1) {book.book_add(); }
			if(ch==2) {book.book_list(); }
			if(ch==3) {System.out.println("로그아웃 되었습니다."); return; }
		}
	}
}
