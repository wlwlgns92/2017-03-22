package Test;

public class Book {
	//�ʵ�
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	
	
	//������
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
		System.out.println("--------�������---------");
		System.out.print("����Ͻ� ������ ISBN�� �Է����ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		boolean check = b_check(b_ISBN);
		if(check) {
			System.out.println("������ ISBN�� ���� �ڷᰡ �ֽ��ϴ�.");
			return false;
		}
		System.out.print("����Ͻ� �������� �Է����ּ��� : "); String b_name = BookApplication.scanner.next();
		
		Book book = new Book(b_ISBN, b_name, true, null);
		for(int i=0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i] = book;
				System.out.println("������ ��ϵǾ����ϴ�."); return true;
			}
		}
		return false;
	}
	
	public static void b_list () {
		System.out.println("---------------�������--------------");
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
		System.out.println("-----------------�뿩--------------");
		System.out.print("�뿩�Ͻ� �ڷ��� ISBN�� �Է����ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		
		boolean check = b_check(b_ISBN);
		if(check) {
			for(int i=0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getB_rental()) {
						System.out.println("���� ������ �ڷ��Դϴ�. �뿩����");
						BookApplication.books[i].setB_rental(false);
						return true;
					}else { 
						System.out.println("���� �������� �ڷ��Դϴ�.");
					}
				}
			}
		}
		return false;
	}
	
	public boolean b_return (String loginid) {
		System.out.println("-----------------�ݳ�--------------");
		System.out.print("�ݳ��Ͻ� �ڷ��� ISBN�� �Է����ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		
		for(int i = 0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] != null && BookApplication.books[i].getB_rental()) {
				if(BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getM_id().equals(loginid)) {
						System.out.println("�ݳ�����");
						BookApplication.books[i].setM_id(null);
						BookApplication.books[i].setB_rental(true);
						return true;
					}
				}
			}
		}
		return false;
	}
	//�޼ҵ�
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
