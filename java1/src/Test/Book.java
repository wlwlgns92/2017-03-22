package Test;

public class Book {

	//필드
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_name;
	//생성자
	public Book() {
		}
	public Book(String b_ISBN, String b_name, boolean b_rental, String m_name) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_name = m_name;
	}
	//메소드
	public boolean book_add() {
		System.out.println("------------------도서등록------------------");
		System.out.println("등록하실 자료의 ISBN을 입력해주세요 : "); String b_ISBN = BookApplication.scanner.next();
		boolean check = bookcheck(b_ISBN);
		if(check) {
			System.out.println("동일한 도서코드가 존재합니다.");
			return false;
		}
		
		System.out.println("등록하실 자료의 자료명을 입력해주세요 : "); String b_name = BookApplication.scanner.next();
		System.out.println();
		
		Book book = new Book(b_ISBN, b_name, b_rental, b_name);
		for(int i=0 ; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i]= book;
				System.out.println("등록이 완료되었습니다."); return true;
			}
		}return false;
	}
	
	public boolean bookcheck(String check_ISBN) {
		for(int i = 0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] != null &&
				BookApplication.books[i].getB_ISBN().equals(check_ISBN)) {
				return true;
			}
		}
		return false;
	}
	public void book_list() {
		System.out.println("------------------도서 목록 페이지 ----------------");
		System.out.println("도서코드\t도서명\t대여여부\t대여회원");
		for(int i = 0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) return;
			Book book = BookApplication.books[i];
			
			System.out.println(book.getB_ISBN()+book.getB_name()+book.getB_rental()+book.getM_name());
		}
		return;
	}
	public boolean book_rental( String loginid ) {
		
	}
	public boolean book_return( String loginid ) {
		
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
	public void setB_rental(boolean b_rental) {
		this.b_rental = b_rental;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	
	
}
