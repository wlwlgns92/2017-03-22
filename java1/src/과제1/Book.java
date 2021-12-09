package ����1;

public class Book { //1��
		
		//�ʵ�
		private String b_ISBN;
		private String b_name;
		private boolean b_rental;
		private String m_id;
		
		
		//������
		public Book() {
			// TODO Auto-generated constructor stub
		}

		public Book(String b_ISBN, String b_name, boolean b_rental, String m_id) {
			this.b_ISBN = b_ISBN;
			this.b_name = b_name;
			this.b_rental = b_rental;
			this.m_id = m_id;
		}
		
		//�޼ҵ�
		// �������
		public static boolean bookadd() {
			System.out.println("\t\t���� ��� ");
			System.out.print("����� ������ ISBN�� �Է��� �ּ��� : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				System.out.println("�̹� ������� ISBN�Դϴ�.");
				return false;
			}
			System.out.print("����� �������� �Է��� �ּ��� : "); String b_name = BookApplication.scanner.next();
			
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] == null) {
					Book book = new Book(b_ISBN, b_name, true, null);
					BookApplication.books[i] = book;
					System.out.println("���� ����� �Ϸ�Ǿ����ϴ�.");
					return true;
				}
			}
			return false;
		}
		// �����뿩
		public static boolean rental(String loginid) {
			
			System.out.print("�뿩�Ͻ� ������ ISBN�� �Է��� �ּ��� : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				for(int i = 0; i < BookApplication.books.length; i++ ) {
					if(BookApplication.books[i].b_rental == true ) {
						System.out.println("�뿩 ����");
						BookApplication.books[i].b_rental = false;
						BookApplication.books[i].setM_id(loginid);
						return true;
					}
				}	
			}
			return false;
		}
		// �����ݳ�
		public static  boolean bookreturn() {
			
			System.out.print("�ݳ��Ͻ� ������ ISBN�� �Է��� �ּ��� : "); String b_ISBN = BookApplication.scanner.next();
			boolean check = ISBNcheck(b_ISBN);
			if(check) {
				for(int i = 0; i < BookApplication.books.length; i++ ) {
					if(BookApplication.books[i].b_rental == false ) {
						System.out.println("�ݳ� ����");
						BookApplication.books[i].b_rental = true;
						BookApplication.books[i].setM_id(null);
						return true;
					}
				}	
			}
			return false;
		}
		// ISBN �ߺ�üũ
		public static boolean ISBNcheck(String b_ISBN) {
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					return true;
				}
			}
			return false;
		}
		
		// ���� ����Ʈ
		public static void booklist() {
			System.out.println("------------------��������Ʈ-----------------");
			System.out.println("ISBN \t ������ \t �뿩���� \t �뿩�� ");
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
		
		
		
		
		
		
		// �޼ҵ�
		// �������
	
		// �������
	
		//ISBNüũ
		
		
		// �뿩
	
		// �ݳ�
		
		
}
