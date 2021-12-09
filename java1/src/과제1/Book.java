package 과제1;

public class Book { //1차
		
		//필드
		private String b_ISBN;
		private String b_name;
		private boolean b_rental;
		private String m_id;
		
		
		//생성자
		public Book() {
			// TODO Auto-generated constructor stub
		}

		public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
			this.b_ISBN = b_ISBN;
			this.b_name = b_name;
			this.b_rental = b_rental;
			this.m_id = m_id;
		}
		
		//메소드
		// 도서등록
		public static boolean bookadd() {
			System.out.println("\t\t도서 등록 ");
			System.out.print("등록할 도서의 ISBN을 입력해 주세요 : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				System.out.println("이미 사용중인 ISBN입니다.");
				return false;
			}
			System.out.print("등록할 도서명을 입력해 주세요 : "); String b_name = BookApplication.scanner.next();
			
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] == null) {
					Book book = new Book(b_ISBN, b_name, true, null);
					BookApplication.books[i] = book;
					System.out.println("도서 등록이 완료되었습니다.");
					return true;
				}
			}
			return false;
		}
		// 도서대여
		public static boolean rental(String loginid) {
			
			System.out.print("대여하실 도서의 ISBN을 입력해 주세요 : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				for(int i = 0; i < BookApplication.books.length; i++ ) {
					if(BookApplication.books[i].b_rental == true ) {
						System.out.println("대여 성공");
						BookApplication.books[i].b_rental = false;
						BookApplication.books[i].setM_id(loginid);
						return true;
					}
				}	
			}
			return false;
		}
		// 도서반납
		public static  boolean bookreturn() {
			
			System.out.print("반납하실 도서의 ISBN을 입력해 주세요 : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				for(int i = 0; i < BookApplication.books.length; i++ ) {
					if(BookApplication.books[i].b_rental == false ) {
						System.out.println("반납 성공");
						BookApplication.books[i].b_rental = true;
						BookApplication.books[i].setM_id(null);
						return true;
					}
				}	
			}
			return false;
		}
		// ISBN 중복체크
		public static boolean ISBNcheck(String b_ISBN) {
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					return true;
				}
			}
			return false;
		}
		
		// 도서 리스트
		public static void booklist() {
			System.out.println("------------------도서리스트-----------------");
			System.out.println("ISBN \t 도서명 \t 대여상태 \t 대여자 ");
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null) {
					System.out.println(BookApplication.books[i].getB_ISBN() + "\t" + BookApplication.books[i].getB_name() + "\t" + BookApplication.books[i].b_rental + "\t" + BookApplication.books[i].getM_id());
				}
			}
			return;
		}
		public String getB_ISBN() {
			return b_ISBN;
		}

		public void setB_ISBN(String b_ISBN) {
			this.b_ISBN = b_ISBN;
		}

		public String getB_name() {
			return b_name;
		}

		public void setB_name(String b_name) {
			this.b_name = b_name;
		}

		public boolean isB_rental() {
			return b_rental;
		}

		public void setB_rental(boolean b_rental) {
			this.b_rental = b_rental;
		}

		public String getM_id() {
			return m_id;
		}

		public void setM_id(String m_id) {
			this.m_id = m_id;
		}
		
		
		
		
		
		
		// 메소드
		// 도서등록
	
		// 도서목록
	
		//ISBN체크
		
		
		// 대여
	
		// 반납
		
		
}
