package ����1;

public class Member { // 1��
	
	// �ʵ�
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	// ������
	// ����
	public Member() {
	
	}
	
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//ȸ������ �޼ҵ�
	public static boolean signup() {
		
		System.out.print("����Ͻ� ���̵� �Է��� �ּ��� :"); String m_id = BookApplication.scanner.next();
			boolean check = idcheck(m_id);
			if(check) {
				System.out.println("������� ���̵� �Դϴ�.");
				return false;
			}
		System.out.print("����Ͻ� ��й�ȣ�� �Է��� �ּ��� :"); String m_pw = BookApplication.scanner.next();
		System.out.print("������ �Է��� �ּ��� :"); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��� �ּ��� :"); String m_phone = BookApplication.scanner.next();
		
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] == null) {
				
				Member member = new Member(m_id, m_pw, m_name, m_phone);
				BookApplication.members[i] = member;
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				return true;
			}
		}
		
		return false;
	}
	//�α��� �޼ҵ�
	public static String login() {
		System.out.print("���̵� �Է��� �ּ��� :"); String m_id = BookApplication.scanner.next();
		System.out.print("��й�ȣ�� �Է��� �ּ��� :"); String m_pw = BookApplication.scanner.next();
		
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_pw().equals(m_pw)) {
				System.out.println("�α��� ����");
				return m_id; 
			}
		}
		return null;
	}
	//���̵�ã�� �޼ҵ�
	public static boolean findid() {
		
		System.out.print("������ �Է��� �ּ��� :"); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��� �ּ��� :"); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_name().equals(m_name) && BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("ȸ������ ���̵�� : " + BookApplication.members[i].getM_id());
				return true;
			}
		}
		return false;
	}
	// ��й�ȣã�� �޼ҵ�
	public static boolean findpw() {
		
		System.out.print("���̵� �Է��� �ּ��� :"); String m_id = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��� �ּ��� :"); String m_phone = BookApplication.scanner.next();
		for(int i =0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id) && BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("ȸ������ ��й�ȣ�� : " + BookApplication.members[i].getM_pw());
				return true;
			}
		}
		return false;
	}
	//�ߺ�üũ �޼ҵ�
	public static boolean idcheck(String m_id) {
		for(int i = 0 ; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && BookApplication.members[i].getM_id().equals(m_id)) {
				return true;
			}
		}
		
		return false;
	}
	
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	
	
	
	
	// ����ʵ� ��� ������.
	
	// ȸ������
	
	// ���̵� �ߺ�üũ
	
	//  �α���
	
	// ���̵�ã��
	
	// ��й�ȣã��

}
