package Test;

public class Book {
	//필드
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	
	
	//생성자
	public Book() {
		super();
	}




	public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
		super();
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}



	public static boolean b_add () {
		System.out.println("--------도서등록---------");
		System.out.print("등록하실 도서의 ISBN을 입력해주세요 : "); String b_ISBN = BookApplication.scanner.next();
		boolean check = b_check(b_ISBN);
		if(check) {
			System.out.println("동일한 ISBN을 가진 자료가 있습니다.");
			return false;
		}
		System.out.print("등록하실 도서명을 입력해주세요 : "); String b_name = BookApplication.scanner.next();
		
		Book book = new Book(b_ISBN, b_name, true, null);
		for(int i=0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i] = book;
				System.out.println("도서가 등록되었습니다."); return true;
			}
		}
		return false;
	}
	
	public static void b_list () {
		System.out.println("---------------도서목록--------------");
		for(int i = 0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) return;
			Book book = BookApplication.books[i];
			System.out.println(book.getB_ISBN()+"\t"+book.getB_name()+"\t"+book.getB_rental()+"\t"+ book.getM_id());
		}
		return;
	}
	
	public static boolean b_check (String check_isbn) {
		for(int i=0; i < BookApplication.books.length; i++ ) {
			if(BookApplication.books[i] != null &&
					BookApplication.books[i].getB_ISBN().equals(check_isbn)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean b_rental (String loginid) {
		System.out.println("-----------------대여--------------");
		System.out.print("대여하실 자료의 ISBN을 입력해주세요 : "); String b_ISBN = BookApplication.scanner.next();
		
		boolean check = b_check(b_ISBN);
		if(check) {
			for(int i=0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getB_rental()) {
						System.out.println("대출 가능한 자료입니다. 대여성공");
						BookApplication.books[i].setB_rental(false);
						return true;
					}else { 
						System.out.println("현재 대출중인 자료입니다.");
					}
				}
			}
		}
		return false;
	}
	
	public boolean b_return (String loginid) {
		System.out.println("-----------------반납--------------");
		System.out.print("반납하실 자료의 ISBN을 입력해주세요 : "); String b_ISBN = BookApplication.scanner.next();
		
		for(int i = 0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] != null && BookApplication.books[i].getB_rental()) {
				if(BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getM_id().equals(loginid)) {
						System.out.println("반납성공");
						BookApplication.books[i].setM_id(null);
						BookApplication.books[i].setB_rental(true);
						return true;
					}
				}
			}
		}
		return false;
	}
	//메소드
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




	public String getM_id() {
		return m_id;
	}




	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	
	
	
	
}
