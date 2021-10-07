package Day07;

public class Book {
	
	//필드[ISBN , 도서명, 대여여부, 대여자아이디 등 ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	
	
	//생성자
		//1. 도서등록 [ 모든 필드]
		//2. 깡통
	public Book() {
	}

	public Book(String b_ISBN, String b_name, Boolean b_rental, String m_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}

	
	//메소드 [ CRUD : 생성, 읽기, 수정, 삭제 ]
			//1. 필드가 private 사용시 = > get , set메소드
			//2. 도서등록 메소드
	public boolean book_add() {
		System.out.println("-----------------도서등록-------------");
		System.out.println("등록하실 도서의 코드를 입력해주세요 : "); String b_ISBN = BookApplication.scanner.next();
		System.out.println("등록하실 도서명을 입력해주세요 : "); String b_name = BookApplication.scanner.next();
											//대여여부 초기값 true, 대여한 회원 null
		Book book = new Book(b_ISBN, b_name, true, null);
		
		boolean check = bookcheck(b_ISBN);
		if(check) {
			System.out.println("동일한 ISBN을 가진 도서가 존재합니다.");
			return false;
		}
		//객체 배열저장
		for(int i =0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i] = book;
			}System.out.println("도서등록이 성공되었습니다."); return true;
		}
		
		return false;
	}
		//6. ISBN 체크 메소드[체크할 대상을 인수로 받아서 배열내 존재하면 true 아니면 false]
	public boolean bookcheck(String check_isbn) { 
	for(int i = 0; i < BookApplication.books.length; i++) {
		if(BookApplication.books[i] != null && 
				BookApplication.books[i].getB_ISBN().equals(check_isbn)	) {
			return true;
		}
	}
		
	return false;
	}

			//3. 도서목록 메소드
	public void book_list() {
		System.out.println("---------------도서목록------------");
		System.out.println("ISBN\t도서명\t대여여부\t대여자ID");
		for(int i = 0 ; i <  BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) return;
			Book book = BookApplication.books[i];	
			System.out.println(book.getB_ISBN()+"\t"+book.getB_name()+"\t"+book.getB_rental()+"\t"+book.getM_id());
			
		}
	 return;	
	}
			//4. 도서대여 메소드[도서코드를 입력받아 대여여부가 true이면 대여하기]
	public boolean book_rental(String loginid) {
		System.out.println("---------------도서대여------------");
		System.out.println("대여할 도서의 ISBN을 입려갷 주세요 : "); String b_ISBN = BookApplication.scanner.next();
			//ISBN 존재여부 체크
		boolean check = bookcheck(b_ISBN);
		if(check) {
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getB_rental()) { //동일한 도서가 존재하면 
						System.out.println("대출 가능한 자료입니다. 대여 성공");
						//1. 대여성공시 대여여부 true => false
						BookApplication.books[i].setB_rental(false);
						//2. 대여성공시 대여회원에 현재 로그인된 아이디 저장
							BookApplication.books[i].setM_id(loginid);
						return true;
					}else {
						System.out.println("현재 대출중인 자료입니다. 대여불가"); return false;
					}
				}
			}
		}else {
			System.out.println("해당 도서코드가 존재하지 않습니다.");
			return false;
		}
	 return false;	
	}
			//5. 도서반납 메소드
	public boolean book_return(String loginid) {
		System.out.println("---------------도서반납------------");
		System.out.println("반납할 도서의 ISBN을 입려해 주세요 : "); String b_ISBN = BookApplication.scanner.next();
		
		//1. 대여중인 책 찾기
		for(int i = 0 ; i < BookApplication.books.length; i++ ) {
			if(BookApplication.books[i] !=null && !BookApplication.books[i].getB_rental()) {
				//2. 입력받은 도서 코드
				if(BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					//3. 로그인된 회원과  == 대여회원과 동일하면
					if(BookApplication.books[i].getM_id().equals(loginid)) {
						System.out.println("반납 성공");
						//반납성공시 대여회원 null
						BookApplication.books[i].setM_id(null);
						//반납성공시 대여여부 = true
						BookApplication.books[i].setB_rental(true);
						return true;
					}
				}
			}
		}
		System.out.println("반납 실패 ");
	
		

		return true;
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

	public boolean getB_rental() {
		return b_rental;
	}

	public void setB_rental(Boolean b_rental) {
		this.b_rental = b_rental;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

}
