package Test;

public class Member {

	
	//�ʵ�
	public static String m_id;
	public static String m_pw;
	public static String m_name;
	public static String m_phone;
	
	
	//������
	
	public Member(String m_id, String m_pw, String m_name, String m_phone) {
		
	}
	public Member() {
		
	}
	
	//�޼ҵ�
	
	public static boolean signup() {
		System.out.println("----------ȸ������----------");
		System.out.print("���̵� �Է��ϼ��� : "); String m_id = BookApplication.scanner.next();
		boolean check = idcheck(m_id);
		if(check) {
			System.out.println("�ߺ��� ���̵� �����մϴ�.");
			return false;
		}
		System.out.print("��й�ȣ�� �Է��ϼ��� : "); String m_pw = BookApplication.scanner.next();
		System.out.print("�̸��� �Է��ϼ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��ϼ��� : "); String m_phone = BookApplication.scanner.next();
		Member member = new Member(m_id, m_pw, m_name, m_phone);
		for(int i =0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] == null) {
				BookApplication.member[i] = member;
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				return true;
			}
		}
		return false;
	}
	public static String login() {
		System.out.println("----------------�α���-------------");
		System.out.print("���̵� �Է��ϼ��� : "); String m_id = BookApplication.scanner.next();
		System.out.print("��й�ȣ�� �Է��ϼ��� : "); String m_pw = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_id().equals(m_id) &&
					BookApplication.member[i].getM_pw().equals(m_pw)) {
				System.out.println("�α����� �����Ǿ����ϴ�.");
				return m_id;
			}
		}
		return null;
	}
	public static boolean idcheck (String check_id) {
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_id().equals(m_id) ) {
				return true;
			}
		}
		return false;
	}
	public static String findid() {
		System.out.print("�̸��� �Է��ϼ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��ϼ��� : "); String m_phone = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_name().equals(m_name) &&
					BookApplication.member[i].getM_phone().equals(m_phone)) {
				System.out.println("������� ���̵��  : "+ BookApplication.member[i].getM_id());		
			}else {
				System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�."); 
				break;
			}
				
		}
		return null;
	}
	public static String findpw () {
		System.out.print("�̸��� �Է��ϼ��� : "); String m_name = BookApplication.scanner.next();
		System.out.print("����ó�� �Է��ϼ��� : "); String m_phone = BookApplication.scanner.next();
		
		for(int i=0; i < BookApplication.member.length; i++) {
			if(BookApplication.member[i] != null && BookApplication.member[i].getM_name().equals(m_name) &&
					BookApplication.member[i].getM_phone().equals(m_phone)) {
				System.out.println("������� ���̵��  : "+ BookApplication.member[i].getM_id());		
			}else {
				System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�."); 
				break;
			}
				
		}
		return null;
	}
	public static String getM_id() {
		return m_id;
	}
	public static void setM_id(String m_id) {
		Member.m_id = m_id;
	}
	public static String getM_pw() {
		return m_pw;
	}
	public static void setM_pw(String m_pw) {
		Member.m_pw = m_pw;
	}
	public static String getM_name() {
		return m_name;
	}
	public static void setM_name(String m_name) {
		Member.m_name = m_name;
	}
	public static String getM_phone() {
		return m_phone;
	}
	public static void setM_phone(String m_phone) {
		Member.m_phone = m_phone;
	}
}
