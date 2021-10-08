package Test;

public class Book {

	//�ʵ�
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_name;
	//������
	public Book() {
		}
	public Book(String b_ISBN, String b_name, boolean b_rental, String m_name) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_name = m_name;
	}
	//�޼ҵ�
	public boolean book_add() {
		System.out.println("------------------�������------------------");
		System.out.println("����Ͻ� �ڷ��� ISBN�� �Է����ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		boolean check = bookcheck(b_ISBN);
		if(check) {
			System.out.println("������ �����ڵ尡 �����մϴ�.");
			return false;
		}
		
		System.out.println("����Ͻ� �ڷ��� �ڷ���� �Է����ּ��� : "); String b_name = BookApplication.scanner.next();
		System.out.println();
		
		Book book = new Book(b_ISBN, b_name, b_rental, b_name);
		for(int i=0 ; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i]= book;
				System.out.println("����� �Ϸ�Ǿ����ϴ�."); return true;
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
		System.out.println("------------------���� ��� ������ ----------------");
		System.out.println("�����ڵ�\t������\t�뿩����\t�뿩ȸ��");
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
