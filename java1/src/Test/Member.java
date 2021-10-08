package Test;



public class Member {
	
	
	//�ʵ�
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_phone;
	//������
	public Member() {
		}
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_phone = m_phone;
	}
	//�޼ҵ�
	//ȸ������
	public static boolean signup() {
		//�Է¹ޱ�
		System.out.println("------------------ȸ������--------------");
		System.out.print("����Ͻ� ���̵� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
		boolean check= idcheck(m_id);
		if(check) {
			System.out.println("�ߺ��� ���̵� �����մϴ�.");
			return false;
		}
		System.out.print("����Ͻ� ��й�ȣ�� �Է��� �ּ��� : "); String m_pw = BookApplication.scanner.next();
		System.out.print("������ ������ ������ �Է��� �ּ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("������ ������ ����ó�� �Է��� �ּ��� : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		for(int i=0; i < BookApplication.members.length; i++ ) {
			if(BookApplication.members[i] == null ) {
				BookApplication.members[i] = member;
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");	return true; 
			}
		}
		
		return false;
	}
	public static String login() {
		System.out.println("-----------�α��� ������-----------");
		System.out.print("���̵� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
		System.out.print("��й�ȣ�� �Է��� �ּ��� : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.members.length; i++)
			if(BookApplication.members[i] != null &&
			BookApplication.members[i].getM_id().equals(m_id) &&
			BookApplication.members[i].getM_pw().equals(m_pw)) {
			System.out.println("�α��ο� �����ϼ̽��ϴ�.");	return m_id;
			}else System.out.println("��ϵ� ������ �����ϴ�.");
	return null;	
	}
	public static String findid() {
		System.out.print("������ ������ ������ �Է����ּ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("������ ������ ����ó�� �Է����ּ��� : "); String m_phone = BookApplication.scanner.next();
		System.out.println();
		
		for(int i = 0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_name().equals(m_name) && 
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("�����Ͻ� ID�� : " + BookApplication.members[i].getM_id()+"�Դϴ�.");
			}else System.out.println("��ϵ� ������ �����ϴ�."); break;
		}
		return null;	
	}
	public static String findpw() {
		System.out.print("������ ������ ID�� �Է����ּ��� : "); String m_id = BookApplication.scanner.next();
		System.out.print("������ ������ ����ó�� �Է����ּ��� : "); String m_phone = BookApplication.scanner.next();
		
		for(int i = 0; i < BookApplication.members.length; i++) {
			if(BookApplication.members[i] != null && 
					BookApplication.members[i].getM_id().equals(m_id) && 
					BookApplication.members[i].getM_phone().equals(m_phone)) {
				System.out.println("�����Ͻ� ��й�ȣ�� : " + BookApplication.members[i].getM_pw()+"�Դϴ�.");
			}else System.out.println("��ϵ� ������ �����ϴ�.");
		}
		return null;	
	}
	public static boolean idcheck(String check_id) {
		for(int i = 0 ; i < BookApplication.members.length; i++) {
			if(BookApplication.books[i] != null && 
					BookApplication.members[i].getM_id().equals(check_id)) {
				return true;
			}
		}return false;
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
	
}
