package Day07;

public class Book {
	
	//�ʵ�[ISBN , ������, �뿩����, �뿩�ھ��̵� �� ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String m_id;
	
	
	
	//������
		//1. ������� [ ��� �ʵ�]
		//2. ����
	public Book() {
	}

	public Book(String b_ISBN, String b_name, Boolean b_rental, String m_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_rental;
		this.m_id = m_id;
	}

	
	//�޼ҵ� [ CRUD : ����, �б�, ����, ���� ]
			//1. �ʵ尡 private ���� = > get , set�޼ҵ�
			//2. ������� �޼ҵ�
	public boolean book_add() {
		System.out.println("-----------------�������-------------");
		System.out.println("����Ͻ� ������ �ڵ带 �Է����ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		System.out.println("����Ͻ� �������� �Է����ּ��� : "); String b_name = BookApplication.scanner.next();
											//�뿩���� �ʱⰪ true, �뿩�� ȸ�� null
		Book book = new Book(b_ISBN, b_name, true, null);
		
		boolean check = bookcheck(b_ISBN);
		if(check) {
			System.out.println("������ ISBN�� ���� ������ �����մϴ�.");
			return false;
		}
		//��ü �迭����
		for(int i =0; i < BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) {
				BookApplication.books[i] = book;
			}System.out.println("��������� �����Ǿ����ϴ�."); return true;
		}
		
		return false;
	}
		//6. ISBN üũ �޼ҵ�[üũ�� ����� �μ��� �޾Ƽ� �迭�� �����ϸ� true �ƴϸ� false]
	public boolean bookcheck(String check_isbn) { 
	for(int i = 0; i < BookApplication.books.length; i++) {
		if(BookApplication.books[i] != null && 
				BookApplication.books[i].getB_ISBN().equals(check_isbn)	) {
			return true;
		}
	}
		
	return false;
	}

			//3. ������� �޼ҵ�
	public void book_list() {
		System.out.println("---------------�������------------");
		System.out.println("ISBN\t������\t�뿩����\t�뿩��ID");
		for(int i = 0 ; i <  BookApplication.books.length; i++) {
			if(BookApplication.books[i] == null) return;
			Book book = BookApplication.books[i];	
			System.out.println(book.getB_ISBN()+"\t"+book.getB_name()+"\t"+book.getB_rental()+"\t"+book.getM_id());
			
		}
	 return;	
	}
			//4. �����뿩 �޼ҵ�[�����ڵ带 �Է¹޾� �뿩���ΰ� true�̸� �뿩�ϱ�]
	public boolean book_rental(String loginid) {
		System.out.println("---------------�����뿩------------");
		System.out.println("�뿩�� ������ ISBN�� �Է��c �ּ��� : "); String b_ISBN = BookApplication.scanner.next();
			//ISBN ���翩�� üũ
		boolean check = bookcheck(b_ISBN);
		if(check) {
			for(int i = 0; i < BookApplication.books.length; i++) {
				if(BookApplication.books[i] != null && BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					if(BookApplication.books[i].getB_rental()) { //������ ������ �����ϸ� 
						System.out.println("���� ������ �ڷ��Դϴ�. �뿩 ����");
						//1. �뿩������ �뿩���� true => false
						BookApplication.books[i].setB_rental(false);
						//2. �뿩������ �뿩ȸ���� ���� �α��ε� ���̵� ����
							BookApplication.books[i].setM_id(loginid);
						return true;
					}else {
						System.out.println("���� �������� �ڷ��Դϴ�. �뿩�Ұ�"); return false;
					}
				}
			}
		}else {
			System.out.println("�ش� �����ڵ尡 �������� �ʽ��ϴ�.");
			return false;
		}
	 return false;	
	}
			//5. �����ݳ� �޼ҵ�
	public boolean book_return(String loginid) {
		System.out.println("---------------�����ݳ�------------");
		System.out.println("�ݳ��� ������ ISBN�� �Է��� �ּ��� : "); String b_ISBN = BookApplication.scanner.next();
		
		//1. �뿩���� å ã��
		for(int i = 0 ; i < BookApplication.books.length; i++ ) {
			if(BookApplication.books[i] !=null && !BookApplication.books[i].getB_rental()) {
				//2. �Է¹��� ���� �ڵ�
				if(BookApplication.books[i].getB_ISBN().equals(b_ISBN)) {
					//3. �α��ε� ȸ����  == �뿩ȸ���� �����ϸ�
					if(BookApplication.books[i].getM_id().equals(loginid)) {
						System.out.println("�ݳ� ����");
						//�ݳ������� �뿩ȸ�� null
						BookApplication.books[i].setM_id(null);
						//�ݳ������� �뿩���� = true
						BookApplication.books[i].setB_rental(true);
						return true;
					}
				}
			}
		}
		System.out.println("�ݳ� ���� ");
	
		

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
